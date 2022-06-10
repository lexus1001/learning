//import java.util.Arrays;
import Interfaces.API;
import Interfaces.DB;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Start {

        public static void main(String[] args) {


            Local ua = new Local();
            Local ru = new Local();
                ua.code = 330;
                ua.country = "Ukraine";
                ru.code = 7;
                ru.country = "Russia";

//             DB PosgreSQL = new DB();
//             API REST = new API();

            String[] logins = {"lexus100", "Alex", "Nikolya", "Marta", "Vera"};
            SimpleCreds lexus100 = new SimpleCreds(2);
            SimpleCreds Alex = new SimpleCreds(logins[1], 12345, true);
            FullCreds Nikolya = new FullCreds(3, logins[2], "3333buiyvytui33", false);
            FullCreds Marta = new FullCreds(4, logins[3], "qwety7", true);
            Creds Vera = new Creds(false);
            //FullCreds Ira = new FullCreds(Marta.fullName);


            int i = 0;
            System.out.println("All users list: ");
            for (String logeens : logins) {
                System.out.print(logins[i] + "; ");
                i++;
            }

            Alex.ent();
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
                    int nmbl100 = lexus100.Numm();
                    //lexus100.passwordLenght();
                    System.out.print("num: ");
                    System.out.println(nmbl100);
                    //lexus100.getNumber();
                    System.out.println(l);
                    ru.loc();
                    int lxsmin = ru.calcu();
                    System.out.println("minus: " + lxsmin);
                    break;
                case "Alex":
                    int nmbAl = Alex.Numm();
                    Alex.passwordLenght();
                    System.out.println(al);
                    ua.loc();
                    int Almin = ua.calcu();
                    System.out.println(Almin);
                    break;
                case "Nikol":
                    //int nmbNiko = Nikolya.Numm();
                    Nikolya.passwordLenght();
                    Nikolya.getNumber();
                    //System.out.println(nmbNiko);
                    System.out.println(ua.country);
                    System.out.println(n);
                    break;
                case "Mara":
                    Marta.getLogin();
                    Marta.passwordLenght();
                    Marta.getNumber();
                    System.out.println(m);
                    ru.loc();
                    break;
                case "Vera":
                    try {
                        //Vera.passwordLenght();
                        if (Vera.getLogin() == null) {
                            throw new Exception("No info about Vera");
                        }
                    } catch (Exception exep2) {
                        exep2.printStackTrace();
                    }
                    ru.loc();
                    break;
                default:
                    System.out.println("No info");
                    break;
            }
        }
    }
class Local {
    String country;
    int code;

    int calcu() {
        int minus = 25 + code;
        return minus;
    }
    void loc() {
        System.out.println(this.country + " (telephone code: +" + this.code + ")");
    }
}




