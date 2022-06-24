//import java.util.Arrays;
import Interfaces.API;
import Interfaces.DB;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.util.random.RandomGenerator;

public class Start {

    public static void main(String[] args) {

        long timestamp;
        timestamp = System.currentTimeMillis();

        Local ua = new Local();
        Local ru = new Local();
        Local ee = new Local();
        ua.setLocal(331, "Ukraine");
        ru.setLocal(7, "Russia");
        ee.setLocal(05, "Eesti");
        Local.description = "Local";
        StringBuilder time = new StringBuilder();
        Local.getDescr();
        time.append(" time is ").append(timestamp).append(" and math = ").append(ee.hashCode());

        System.out.printf(time.toString() + "%.3f\n", Math.pow(1.1, 18));

//             DB PosgreSQL = new DB();
//             API REST = new API();

        String[] logins = {"lexus100", "Alex", "Nikolya", "Marta", "Zina", "Ira", "Denis"};

        SimpleCreds defaultSimpleCreds = new SimpleCreds();
        FullCreds defaultFullCreds = new FullCreds();
        SimpleCreds lexus100 = new SimpleCreds(0);
        SimpleCreds Alex = new SimpleCreds(logins[1], 1234567890, true); //ToDo *Bug* Exeptoin >13 doesn't work on SimpleCreds users
        FullCreds Denis = new FullCreds();
        FullCreds Nikolya = new FullCreds(3, logins[2], "3333brteguitui33", false);
        FullCreds Marta = new FullCreds(4, logins[3], "qwer5y67", true);
        //FullCreds Zina = new FullCreds(6, "Zina", "5555",false);
        Creds Zina = new SimpleCreds(7);
        MegaFullCreds Ira = new MegaFullCreds(5, logins[5], "", false, false);

        lexus100.l10n.setLocal(6, "Armenia");
        Alex.l10n.setLocal(352, "Whiterussia");
        //Zina.l10n.setLocal(7, "Russia");
        Marta.l10n.setLocal(12,"");

        int i = 0;
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

//        REST.read();  //
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

        //  System.out.println(Arrays.toString(logins));

        Class a;
        a = ua.getClass();
        System.out.println("\nua from class " + a);

        Class l = lexus100.getClass();
        Class n = Nikolya.getClass();
        Class ir = logins[5].getClass();

//lexus100.FirstTest();

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

        do { //ToDo Сделать работающий do_while


            switch (u) { //ToDo *feature* Игнорировать размер букв
                case "lexus100":
                    lexus100.bigPass();
                    lexus100.DisplayNumber();
                    System.out.println(l);
                    lexus100.l10n.loc();
                    defaultSimpleCreds.printCountClassCreds();
                    break;
                case "Alex" :
                    Alex.passwordLenght();
                    Alex.bigPass();
                    Alex.l10n.loc();
                    defaultSimpleCreds.printCountClassCreds();
                    break;
                case "Nikolya":
                    Nikolya.DisplayNumber();
                    Nikolya.passwordLenght();
                    Nikolya.bigPass();
                    System.out.println(n);
                    ee.loc();
                    Nikolya.isBanned();
                    defaultFullCreds.printCountClassCreds();
                    break;
                case "Mara":
                    Marta.DisplayLogin();
                    Marta.DisplayNumber();
                    Marta.passwordLenght();
                    Marta.bigPass();
                    ua.loc();
                    Marta.isBanned();
                    Marta.printCountClassCreds();
                    break;
                case "Zina":
                    defaultSimpleCreds.printCountClassCreds();
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
                    break;
                case "Den":
                    Denis.printCountClassCreds();
                    break;
                default :
                    System.out.println("No info");
                    break;
            }
        } while (u.equals("q")); //ToDo *feature* Реализовать выход по кнопке q

    }

    static class Local {
        private String country;
        private int code;
        public static String description;


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
                System.out.println(description + ": " + this.getCountry() + " (telephone code: +" + this.getCode() + ")");
            } else if (country.isEmpty()) {
                System.out.println("Country name needed");
            } else
                System.out.println(description + " " + getCountry() + " is permitted");
        }
        public static void getDescr() {
            System.out.print(description);
        }
    }
}




