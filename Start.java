import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

       // DB PosgreSQL = new DB();
        // API REST = new API();

        String[] logins = {"lexus100", "Alex", "Nikolya", "Marta", "Vera"};
        SimpleCreds lexus100 = new SimpleCreds(1);
        SimpleCreds Alex = new SimpleCreds(logins[1], 12345, true);
        FullCreds Nikolya = new FullCreds(3, logins[2], "3333buiyvytui33", false);
        FullCreds Marta = new FullCreds(4, logins[3], "qwety", true);
        Creds Vera = new Creds(false);

        int i=0;
        for (String logeens : logins) {
            System.out.println(logins[i]);
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
        }
        catch (Exception exep1){
            System.out.println(exep1.getMessage());
            exep1.printStackTrace();
        }
        lexus100.getPassword();

//        REST.read();  // Интерфейсы
//        REST.listen();
//        PosgreSQL.read();
//         Interface Tool = PosgreSQL;

      //  System.out.println(Arrays.toString(logins));

        String u;
         System.out.println("Please enter login: ");
        Scanner User = new Scanner(System.in);
        u = User.nextLine();

        switch (u) {
            case "lexus100" :
                //lexus100.passwordLenght();
                System.out.print("num: ");
                lexus100.getNumber();
                lexus100.Num();
                break;
            case "Alex" :
                Alex.passwordLenght();
                break;
            case "Nikol":
                Nikolya.passwordLenght();
                Nikolya.getNumber();
                break;
            case "Mara" :
                Marta.getLogin ();
                Marta.passwordLenght();
                Marta.getNumber();
                break;
            case "Vera" :
                try {
                    //Vera.passwordLenght();
                    if (Vera.getLogin() == null)
                    {
                        throw new Exception ("No info about Vera");
                    }
                }
               catch (Exception exep2) {
                   exep2.printStackTrace();
               }
                break;
            default:
                System.out.println("No info");
        }

    }

}
