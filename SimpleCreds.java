public class SimpleCreds extends Creds {

    private String login;

    public SimpleCreds (int number) {

    }
    public SimpleCreds (String login, int pwd, boolean thisIsSimpleCreds) {
        setLogin (login);
        setPassword (String.valueOf(pwd));
    }



    public int passwordLenght() {
        int passlnght = super.passwordLenght();
        return passlnght;
    }

    public String getPassword() {
        String simplePass = super.getPassword();
        return "Pass: " + simplePass;
    }

    void ent() {
        System.out.println(getLogin()+ " : " + getPassword());
    }

        void isSimpleCreds() {
            System.out.println("This is SimpleCreds");
        }

}
