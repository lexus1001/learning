import Interfaces.DB;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start {

    public static void main(String[] args) //throws IOException
    {

        short timestamp;
        timestamp = (short) System.currentTimeMillis();
        Logger MainFile = Logger.getLogger("NotAnon Loger");

        int un;
        Local ua = new Local();
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

        String[] logins = {"admin", "lexus100", "Alex", "Nikolya", "Marta", "Zina", "Ira", "Denis"};
        String[] loginsFile = new String[8];

        int counter = 0;
        String seprtr = File.separator;
        String IFL = "o:" + seprtr + "Development" + seprtr + "InitialUsersList.txt";
        File InitialUsersList = new File(IFL);
        try {

            Scanner InFL = new Scanner(InitialUsersList);
            String IFLF = InFL.nextLine();

            System.out.print("\nInitial list of logins: ");
            //while (InFL.hasNextLine()) {
            //String IFLF = InFL.nextLine();
            //  System.out.println("\nInitial users list: " + IFLF);
            String[] InitialLogins = IFLF.split(", ", 8);
            for (String IL : InitialLogins) {
                loginsFile[counter++] = String.valueOf(IL);
                System.out.print("\t" + loginsFile[counter - 1]);
            }
            InFL.close();
        } catch (Exception e0) {
            MainFile.log(Level.WARNING, "File " + InitialUsersList.getName() + " doesn't exist.");
        }

        // System.out.println(Arrays.toString(InitialLogins));
        //}

        SimpleCreds lexus100 = new SimpleCreds(2);
        SimpleCreds Alex = new SimpleCreds(loginsFile[2], 123458900, true); //ToDo *Bug* Exeptoin >13 doesn't work on SimpleCreds users
        SimpleCreds Diman = new SimpleCreds("Dima", 766847363, true); //ToDo *Bug* Выяснить почему если поставить лонг, то ошибка, хотя нигде не int
        FullCreds Denis = new FullCreds();
        FullCreds Nikolya = new FullCreds(20, loginsFile[3], "333", false);
        FullCreds Marta = new FullCreds(4, loginsFile[4], "qwer5y67", true);
        FullCreds Zina = new FullCreds(7, "Zinna", "5555", false);
        //Creds Zina = new SimpleCreds(7);
        MegaFullCreds Ira = new MegaFullCreds(5, loginsFile[6], "", false, false);
        MegaFullCreds admin = new MegaFullCreds(0, "Admin", "123456789", false, true) {

            @Override
            public void passwordLenght() {
                System.out.println("Odmen password lenght = " + (password.length() - getCCC()));
                this.l10n.setLocal(0, "World");
            }
        };

        lexus100.l10n.setLocal(6, "Armenia");
        Alex.l10n.setLocal(352, "Whiterussia");
        Marta.l10n.setLocal(12, "");

        byte i = 0;
        System.out.println("\nAll users list: ");
        for (String logeens : logins) {
            if (i < (logins.length - 1)) {
                System.out.print(logins[i] + "; ");
                i++;
            } else {
                System.out.print(logins[i] + ". ");
            }
        }
        System.out.printf("\nFull count of users: %d", logins.length);
        System.out.printf("\nFull count of users in file: %d", loginsFile.length);

//        REST.read();  //
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

        String u;
        System.out.println("\n\tPlease enter user number ");
        Scanner Number = new Scanner(System.in);
        un = Number.nextInt();
        try { //ToDo Разобраться с исключениями до конца.
            if (un < 0) {
                throw new NegativeArraySizeException("Не может быть меньше нуля");
            } else if (un > logins.length) {
                throw new ArrayIndexOutOfBoundsException("Too big num");
            } else if (logins[un].isEmpty()) { //ToDo Если не воспроизводится условия if, то throw не выполняется.
                throw new InputMismatchException("fdg");
            }
            {
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
        //while (u.equals('q')) {

            switch (u) { //ToDo *feature* Игнорировать размер букв
                case "admin":
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
                case "Alex":
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
                        if (Zina.getNumber() == 6) {
                            System.out.println(Zina.getLogin());
                        }
                    } catch (Exception exep2) {
                        System.out.println("No login for Zina");
                    }
                    break;
                case "Ira":
                    Ira.ent();
                    Ira.isBanned();
                    Ira.passwordLenght();
                    Ira.bigPass();
                    // System.out.println(ir);
                    Ira.printCountClassCreds();
                    Ira.setAdmin(false);
                    Ira.hasMail();
                    break;
                case "Denis":
                    String DenPath = "o:" + seprtr + "Development" + seprtr + "Credentials" + seprtr + loginsFile[un] + ".txt";
                    // File Den = new File (loginsFile[7] + ".txt");
                    File Den = new File(DenPath);
                    Scanner DenFile = null;
                    try {
                        DenFile = new Scanner(Den);
                    } catch (FileNotFoundException e) {
                        //throw new RuntimeException(e);
                        MainFile.log(Level.WARNING, "File not found!"); //ToDo Get file name or path
                    }
                    while (DenFile.hasNextLine()) {
                        String DenStr = DenFile.nextLine();
                        System.out.println(DenStr);
                    }
                    break;
                default:
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
    }
}




