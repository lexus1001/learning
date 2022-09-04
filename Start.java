//import java.util.Arrays;
import Interfaces.DB;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws FileNotFoundException {

        long timestamp;
        timestamp = System.currentTimeMillis();


        Local ua= new Local();
        Local ru = new Local();
        Local ee = new Local();
        ua.setLocal(331, "Ukraine");
        ru.setLocal(7, "Russia");
        ee.setLocal(05, "Eesti");
        Local.DESCRIPTION = "Local";
        StringBuilder time = new StringBuilder();
        Local.getDescr("Местное время: ");
        time.append(" time is ").append(timestamp).append(" and math = ").append(ee.hashCode());

        float mt = (float) Math.round(Math.pow(1.1, 16));
        double mtt = Math.random();
        System.out.printf(time.toString() + "%.3f, %f\n", mt, mtt);

             DB PosgreSQL = new DB();
//             API REST = new API();

        String[] logins = {"admin","lexus100", "Alex", "Nikolya", "Marta", "Zina", "Ira", "Denis"};

        SimpleCreds lexus100 = new SimpleCreds(2);
        SimpleCreds Alex = new SimpleCreds(logins[2], 123458900, true); //ToDo *Bug* Exeptoin >13 doesn't work on SimpleCreds users
        SimpleCreds Diman = new SimpleCreds("Dima", 766847363,true); //ToDo *Bug* Выяснить почему если поставить лонг, то ошибка, хотя нигде не int
        FullCreds Denis = new FullCreds();
        FullCreds Nikolya = new FullCreds(20, logins[3], "333", false);
        FullCreds Marta = new FullCreds(4, logins[4], "qwer5y67", true);
        //FullCreds Zina = new FullCreds(6, "Zina", "5555",false);
        Creds Zina = new SimpleCreds(7);
        MegaFullCreds Ira = new MegaFullCreds(5, logins[6], "", false, false);
        MegaFullCreds admin = new MegaFullCreds(0, "Admin", "123456789", false, true) {

            @Override
            public void passwordLenght() {
                System.out.println("Odmen password lenght = " + (password.length()- getCCC()));
                this.l10n.setLocal(0, "World");
            }
        };

        lexus100.l10n.setLocal(6, "Armenia");
        Alex.l10n.setLocal(352, "Whiterussia");
        //Zina.l10n.setLocal(7, "Russia");
        Marta.l10n.setLocal(12,"");


        byte i = 0;
        System.out.println("All users list: ");
        for (String logeens : logins) {
            if (i < (logins.length - 1)) {
                System.out.print(logins[i] + "; ");
                i++;
            } else {
                System.out.print(logins[i] + ". ");
            }
        }
        System.out.printf("\nFull count of users: %d", logins.length);

        String seprtr = File.separator;
        String IFL = "o:" + seprtr + "Development" + seprtr + "InitialUsersList.txt";
        File InitialUsersList = new File(IFL);
        Scanner InFL = new Scanner(InitialUsersList);
        System.out.print("\nInitial list of logins: ");
        //while (InFL.hasNextLine()) {
            String IFLF = InFL.nextLine();
          //  System.out.println("\nInitial users list: " + IFLF);
        String[] InitialLogins = IFLF.split(";",4);
//        for (String IL : InitialLogins) {
//            Integer.parseInt(IL);
//        }
        System.out.println(Arrays.toString(InitialLogins));
        //}
        InFL.close();


//        REST.read();  //
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

        Class l = lexus100.getClass();
        Class ir = logins[5].getClass();

        String u;
        int un;
        System.out.println("\n\tPlease enter user number ");
        Scanner Number = new Scanner(System.in);

        try { //ToDo Разобраться с исключениями до конца.
            un = Number.nextInt();
            if (un < 0) {
                throw new ArrayIndexOutOfBoundsException("Не может быть меньше нуля");
            } else if (un > logins.length) {
                throw new NegativeArraySizeException("Too big num");
            } else if (logins[un].isEmpty()) { //ToDo Если не воспроизводится условия if, то throw не выполняется.
                throw new InputMismatchException("fdg");
            }{
                System.out.println(logins[un]);
                u = logins[un];
            }
        } catch (ArrayIndexOutOfBoundsException excep) {
            excep.printStackTrace();
            System.out.println("\tPlease enter login: ");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        } catch (NegativeArraySizeException exep_arr_n) {
            exep_arr_n.printStackTrace();
            System.out.println("\tPlease enter loggin: ");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        } catch (InputMismatchException exep_arr_i) {
            //exep_arr_i.printStackTrace();
            System.out.println("Некорректно введён номер, укажите имя пользователя");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        }

//        do
//        { //ToDo Сделать работающий do_while
//        continue; }
//        while (u.equals('q'));

            switch (u) { //ToDo *feature* Игнорировать размер букв
                case "admin" :
                    admin.ent();
                    admin.passwordLenght();
                    admin.l10n.loc();
                    admin.setAdmin(true);
                    break;
                case "lexus100":
                    lexus100.bigPass();
                    lexus100.DisplayNumber();
                    //System.out.println(l);
                    lexus100.l10n.loc();
                    SimpleCreds.printCountClassCreds();
                    lexus100.FirstTest();
                    break;
                case "Alex" :
                    fullInfo(Alex);
                   SimpleCreds.printCountClassCreds();
                    break;
                case "Nikolya":
                   fullInfo(Nikolya);
                    ee.loc();
                    Nikolya.isBanned();
                    FullCreds.printCountClassCreds();
                    break;
                case "Marta":
                    fullInfo(Marta);
                    Marta.isBanned();
                    Marta.printCountClassCreds();
                    break;
                case "Zina":
                    SimpleCreds.printCountClassCreds();
                    try {
                        //Vera.passwordLenght();
                        if (Zina.getLogin() == null) {
                            throw new Exception("No info about Zina");
                        }
                    } catch (Exception exep2) {
                        exep2.printStackTrace();
                    }
                    Zina.l10n.loc();
                    break;
                case "Ira":
                    Ira.ent();
                    Ira.isBanned();
                    Ira.passwordLenght();
                    Ira.bigPass();
                    System.out.println(ir);
                    Ira.printCountClassCreds();
                    Ira.setAdmin(false);
                    Ira.hasMail();
                    break;
                case "Den":
                    Denis.printCountClassCreds();
                    fullInfo(Denis);
                    break;
                default :
                    System.out.println("No info");
                    break;
            }
    }
    static class Local {
        private String country;
        private int code;
        public static String DESCRIPTION;

        public Local() {
            setLocal(code, country);
        }

        void setLocal(int code, String ccountry) {
            this.code = code;
            country = ccountry;
        }
        public Object getCode() {
            return code;
        }
        public String getCountry() {
            return country;
        }
        void loc() {
            if ((country.equals("Russia") | country == "Ukraine") & code >= 7) {
                System.out.println(DESCRIPTION + ": " + this.getCountry() + " (telephone code: +" + this.getCode() + ")");
            } else if (country.isEmpty()) {
                System.out.println("Country name needed");
            } else
                System.out.println(DESCRIPTION + " " + getCountry() + " is permitted");
        }
        public final static void getDescr() {
            System.out.print(DESCRIPTION);
        }

        public final static void getDescr(String descrRu) {
            System.out.print(descrRu);
        }
    }
    public static void fullInfo (@NotNull Creds admin) {
        //admin.DisplayLogin();
        admin.DisplayNumber();
        admin.passwordLenght();
        admin.ent();
        admin.bigPass();
        admin.classSelector();
        //admin.l10n.loc();
    }
}




