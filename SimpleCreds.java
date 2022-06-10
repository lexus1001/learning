public class SimpleCreds extends Creds {


    public SimpleCreds (int number) {}
    public SimpleCreds(String login, int pwd, boolean thisIsSimpleCreds) {
        setLogin(login);
        setPassword(String.valueOf(pwd));
    }

    public SimpleCreds(boolean thisIsSC) {
        super(thisIsSC);
    }

    int Numm () {
        int num = this.getNumber();
        return num;
    }

//    public int passwordLenght() {
//        int passlnght = super.passwordLenght();
//        return passlnght;
//    }

    @Override
    public int passwordLenght() {
        return super.passwordLenght();
    }

    public String getPassword() {
        String simplePass = super.getPassword();
        return "Pass: " + simplePass;
    }

//    public int getNumber(int number) {
//        int simpleNumber = super.getNumber();
//        return simpleNumber;
//    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    void isSimpleCreds() {
            System.out.println("This is SimpleCreds");
        }

}
