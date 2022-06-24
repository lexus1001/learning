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

    public void FirstTest() {
        if (this.getNumber() == 2) {
            out.println("Really first Test??");
        } else
            out.println("First test failed.");
    }

    @Override
    public void DisplayNumber() {
        out.println("Number of this user equal " + this.getNumber());
    }

    @Override
    protected void printCountClassCreds() {
        out.printf ("Count of %s users - %d, %s", "SimpleCreds", countClassCreds, " \n");
    }

    @Override
    public String getPassword() {
        String simplePass = super.getPassword();
        return "Pass: " + simplePass;
    }

}