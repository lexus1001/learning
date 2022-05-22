public class Start {
    public static void main(String[] args) {


    Creds lexus100 = new Creds();
    SimpleCreds Alex = new SimpleCreds("Alex", 12345, true);
    FullCreds Nikolya = new FullCreds(1,"Nikol", "333333", false);


        System.out.println(Alex.getLogin()+ "  " + Alex.getPassword());
        Alex.ent();
        try {
            Alex.passwordLenght();
        }
        catch (Exception exeep){
            exeep.printStackTrace();
        }
        System.out.println("noun");
        Alex.isSimpleCreds();
        Nikolya.passwordLenght();
        Nikolya.getLogin();
        lexus100.getLogin();
        //lexus100.passwordLenght();
        System.out.println(Nikolya.getLogin() + "  " + Nikolya.getPassword());

    }

}
