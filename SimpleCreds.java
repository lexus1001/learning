import static java.lang.System.*;
public final class SimpleCreds extends Creds {

    private static int countClassCreds;
    long password;

    public SimpleCreds(int number) {
        setNumber(number);
        countClassCreds++;
    }
    public SimpleCreds(String login, long pwd, boolean thisIsSimpleCreds) {
        setLogin(login);
        setPassword(String.valueOf(pwd));
        countClassCreds++;
    }
    public SimpleCreds() {}

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

    protected static void printCountClassCreds() {
        out.printf ("Count of %s users - %d, %s", "SimpleCreds", countClassCreds, " \n");
    }

//    protected String getPassword() { //ToDo This pass may be integer...
//        int simplePass = password;
//        return simplePass;
//    }

}