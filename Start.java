public class Start {
    public static void main(String[] args) {


        Creds lexus100 = new Creds();
        SimpleCreds Alex = new SimpleCreds("Alex", 12345, true);
        FullCreds Nikolya = new FullCreds(1, "Nikol", "3333buiyvytui33", false);


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

    }

}
