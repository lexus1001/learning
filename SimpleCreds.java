public class SimpleCreds extends Creds {

    public SimpleCreds (int number) {

    }
    public SimpleCreds (String login, int pwd, boolean thisIsSimpleCreds) {
        setLogin (login);
        setPassword (pwd);
    }

    public int passwordLenght() {
        int passlnght = super.passwordLenght();
        return passlnght;
    }

    public String getPassword() {
        String simplePass = super.getPassword();
        return "This is pwd "+ simplePass;
    }

    void ent() {
        System.out.println(getLogin()+ " : " + getPassword());
    }

        void isSimpleCreds() {
            System.out.println("This is SimpleCreds");
        }

}
