import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        DB PosgreSQL = new DB();
        API REST = new API();
        SimpleCreds lexus100 = new SimpleCreds(1);
        SimpleCreds Alex = new SimpleCreds("Alex", 12345, true);
        FullCreds Nikolya = new FullCreds(3, "Nikol", "3333buiyvytui33", false);
        FullCreds Marta = new FullCreds(4, "Marta", "qwety", true);


        System.out.println(Alex.getLogin() + "  " + Alex.getPassword());
        Alex.ent();
        try {
            Alex.passwordLenght();
        } catch (NullPointerException exeep) {
            //exeep.printStackTrace();
            exeep.fillInStackTrace();
        }
        System.out.println("Невозможно посчитать длину пароля у пользователя " + Alex.getLogin());
        Alex.isSimpleCreds();
        Nikolya.passwordLenght();
        try {
            int x = Nikolya.getPassword().length();
            if (x > 13) {
                throw new Exception("Too long password");
            }
        }
        catch (Exception exep1){
            System.out.println(exep1.getMessage());
        }
        System.out.println("Try again");
        Nikolya.getLogin();
        lexus100.getLogin();
        //lexus100.passwordLenght();
        System.out.println(Nikolya.getLogin() + "  " + Nikolya.getPassword());

        REST.read();
        REST.listen();
        PosgreSQL.read();

         Interface Tool = PosgreSQL;

        String u;
         System.out.println("Please enter login: ");
        Scanner User = new Scanner(System.in);
        u = User.nextLine();

        switch (u) {
            case "lexus100" :
                System.out.println("num: ");
                lexus100.getNumber();
                break;
            case "Alex" :
                Alex.ent();
                break;
            case "Nikol":
                Nikolya.passwordLenght();
                break;
            case "Mara" :
                Marta.getLogin();
                Marta.getPassword();
            default:
                System.out.println("No info");
        }

    }

}
