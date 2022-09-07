import static java.lang.System.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogRecord;
public final class SimpleCreds extends Creds {

    private static int countClassCreds;
    long password;
    Logger simpleLogger = Logger.getLogger("Positive");
    LogRecord lgrec = new LogRecord(Level.ALL,"Wrote");

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
            simpleLogger.log(Level.INFO,"Tested");
            out.println(lgrec.getLoggerName());
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
}