import static java.lang.System.*;
public class SimpleCreds extends Creds {

    private static int countClassCreds;


    public SimpleCreds(int number) {
        setNumber(number);
        countClassCreds++;
    }

    public SimpleCreds(String login, int pwd, boolean thisIsSimpleCreds) {
        setLogin(login);
        setPassword(String.valueOf(pwd));
        countClassCreds++;
    }

    public SimpleCreds() {
    }

    ;

    public void FirstTest() {
        if (this.getNumber() == 2) {
            System.out.println("Really first Test??");
        } else
            out.println("First test failed.");
    }

    @Override
    public void DisplayNumber() {
        System.out.println("Number of this user equal " + this.getNumber());
    }

    @Override
    protected void printCountClassCreds() {
        System.out.println("Count of SimpleCreds users - " + countClassCreds);
    }

    @Override
    public String getPassword() {
        String simplePass = super.getPassword();
        return "Pass: " + simplePass;
    }

    void isSimpleCreds() {
        System.out.println("This is SimpleCreds");
    }

    public void bigPass() { //ToDo *fix* Доработать функцию перевода пароля из int  в String
        try {
            int x = String.valueOf(this.getPassword()).length();
            StringBuilder TLPass = new StringBuilder("Too long password on user ");
            TLPass.append(this.login);
            if (x > 11) {
                throw new Exception(String.valueOf(TLPass));
            }
        } catch (Exception exep1) {
            exep1.printStackTrace();

        }
    }
}