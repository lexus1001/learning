//import java.util.Arrays;
import Interfaces.API;
import Interfaces.DB;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Start {

        public static void main(String[] args) {

            boolean ban;



            Local ua = new Local();
            Local ru = new Local();
            Local ee = new Local();
                ua.setLocal(331,"Ukraine");
                ru.setLocal(7,"Russia");
                ee.setLocal(05, "");


//             DB PosgreSQL = new DB();
//             API REST = new API();

            String[] logins = {"lexus100", "Alex", "Nikolya", "Marta", "Zina","Ira"};
            Creds Denis = new Creds();
            SimpleCreds lexus100 = new SimpleCreds (2);
            SimpleCreds Alex = new SimpleCreds(logins[1], 12345, true);
            FullCreds Nikolya = new FullCreds(3, logins[2], "3333buiyvytui33", false);
            FullCreds Marta = new FullCreds(4, logins[3], "qwety7", true);
            Creds Zina = new Creds(false);
            MegaFullCreds Ira = new MegaFullCreds(5,logins[5],"", false,false );

            int i = 0;
            System.out.println("All users list: ");
            for (String logeens : logins) {
                System.out.print(logins[i] + "; ");
                i++;
            }
            System.out.println();
//        try {
//            Alex.passwordLenght();
//        } catch (Exception exeep) {
//            exeep.printStackTrace();
//        }
//        try {
//            lexus100.passwordLenght();
//        } catch (NumberFormatException exeep1) {
//            exeep1.fillInStackTrace();
//        }
//        System.out.println("Невозможно посчитать длину пароля у пользователя " + Alex.getLogin());
            try {
                int x = Nikolya.getPassword().length();
                if (x < 13) {
                    throw new Exception("Too long password");
                }
            } catch (Exception exep1) {
                exep1.printStackTrace();
                //System.out.println(exep1.getMessage());
            }
            lexus100.getPassword();

//        REST.read();  // Интерфейсы
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

            //  System.out.println(Arrays.toString(logins));

            Class a;
            a = ua.getClass();
            System.out.println(a);

            Class m = Marta.getClass();
            Class al = Alex.getClass();
            Class l = lexus100.getClass();
            Class n = Nikolya.getClass();
            //Class ir = Ira.getClass();


            String u;
            System.out.println("Please enter login: ");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();

            switch (u) {
                case "lexus100":
                    lexus100.DisplayNumber();
                    System.out.println(l);
                    ru.loc();
                    int lxsmin = ru.calcu();
                    System.out.println("minus: " + lxsmin);
                    break;
                case "Alex":
                    Alex.passwordLenght();
                    System.out.println(al);
                    ua.loc();
                    int Almin = ua.calcu();
                    System.out.println(Almin);
                    break;
                case "Nikol":
                    Nikolya.DisplayNumber();
                    Nikolya.passwordLenght();
                    System.out.println(n);
                    ee.loc();
                    Nikolya.isBanned();
                    break;
                case "Mara":
                    Marta.getLogin();
                    Marta.DisplayNumber();
                    Marta.passwordLenght();
                    System.out.println(m);
                    ru.loc();
                    Marta.isBanned();
                    break;
                case "Zina":
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
                case "Ira" :
                    Ira.ent();
                    Ira.isBanned();
                    Ira.passwordLenght();
                    break;
                default:
                    System.out.println("No info");
                    break;
            }
        }
    }
class Local {
    private String country;
    private int code;

    public Local () {
        setLocal(code,country);
    }

    int calcu() {
        int minus = 25 + code;
        return minus;
    }
    void setLocal(int ccode, String ccountry) {
            code = ccode;
            country = ccountry;
    }

    public Object getCode() {
        return code;
    }
    public String getCountry() {
        return country;
    }

    void loc() {
        if ((country=="Russia"| country == "Ukraine") & code>=7 ){
            System.out.println(this.getCountry() + " (telephone code: +" + this.getCode() + ")");
        }
        else if (country.isEmpty()) {
            System.out.println("Country name needed");
        }
        else
            System.out.println("Local " + getCountry() + " is permitted");
    }
}




