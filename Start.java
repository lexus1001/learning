//import java.util.Arrays;
import Interfaces.API;
import Interfaces.DB;

import java.util.Locale;
import java.util.Scanner;

public class Start {

        public static void main(String[] args) {


            Local ua = new Local();
            Local ru = new Local();
            Local ee = new Local();
            ua.setLocal(331, "Ukraine");
            ru.setLocal(7, "Russia");
            ee.setLocal(05, "Eesti");
            Local.description = "Local";
            Local.getDescr();

            System.out.println(Math.pow(1.1, 18));

//             DB PosgreSQL = new DB();
//             API REST = new API();

            String[] logins = {"lexus100", "Alex", "Nikolya", "Marta", "Zina", "Ira", "Denis"};
            SimpleCreds defaultSimpleCreds = new SimpleCreds();
            FullCreds defaultFullCreds = new FullCreds();
            SimpleCreds lexus100 = new SimpleCreds(2);
            SimpleCreds Alex = new SimpleCreds(logins[1], 1234567890, true); //ToDo *Bug* Exeptoin >13 doesn't work on SimpleCreds users
            FullCreds Denis = new FullCreds();
            FullCreds Nikolya = new FullCreds(3, logins[2], "3333buitui33", false);
            FullCreds Marta = new FullCreds(4, logins[3], "qwerdy746jnu67", true);
            //FullCreds Zina = new FullCreds(6, "Zina", "5555",false);
            Creds Zina = new SimpleCreds(7);
            MegaFullCreds Ira = new MegaFullCreds(5, logins[5], "", false, false);

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
            System.out.println("\nFull count of users: " + logins.length);
//
//            try {
//                int x = Nikolya.getPassword().length();
//                if (x > 13) {
//                    throw new Exception("Too long password");
//                }
//            } catch (Exception exep1) {
//                exep1.printStackTrace();
//                //System.out.println(exep1.getMessage());
//            }


//        REST.read();  //
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

            //  System.out.println(Arrays.toString(logins));

            Class a;
            a = ua.getClass();
            System.out.println("ua from class " + a);

            Class m = Marta.getClass();
            Class al = Alex.getClass();
            Class l = lexus100.getClass();
            Class n = Nikolya.getClass();
            Class ir = logins[5].getClass();

//lexus100.FirstTest();

            String u;
            do {
                System.out.println("Please enter login: ");
                Scanner User = new Scanner(System.in);
                u = User.nextLine();
                String ug;

                switch (u) { //ToDo *feature* Игнорировать размер букв
                    case "lexus100":
                        lexus100.bigPass();
                        lexus100.DisplayNumber();
                        System.out.println(l);
                        ru.loc();
                        break;
                    case "Alex":
                        Alex.passwordLenght();
                        Alex.bigPass();
                        System.out.println(al);
                        ua.loc();
                        defaultSimpleCreds.printCountClassCreds();
                        break;
                    case "Nikol":
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
                        System.out.println(m);
                        ru.loc();
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
                        ru.loc();
                        break;
                    case "Ira":
                        Ira.ent();
                        Ira.isBanned();
                        Ira.passwordLenght();
                        Ira.bigPass();
                        System.out.println(ir);
                        Ira.printCountClassCreds();
                        break;
                    default:
                        System.out.println("No info");
                        break;
                }
            } while (u.equals("q")); //ToDo *feature* Реализовать выход по кнопке q
        }
    }
class Local {
    private String country;
    private int code;
    public static  String description;

    public Local () {
        setLocal(code,country);
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
        if ((country.equals("Russia")| country == "Ukraine") & code>=7 ){
            System.out.println(description + ": " + this.getCountry() + " (telephone code: +" + this.getCode() + ")");
        }
        else if (country.isEmpty()) {
            System.out.println("Country name needed");
        }
        else
            System.out.println(description + getCountry() + " is permitted");
    }

    public static void getDescr() {
        System.out.println(description);
    }

}




