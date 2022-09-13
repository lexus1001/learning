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

    @Override
    public void DisplayNumber(){
        try {
            if (getNumber()<2){
                throw new NumberException("Too too small number");
            } else if (getNumber()<5) {
                throw new NumberException("Just too small");
            } else out.println("Number of this user equal " + this.getNumber());
        }
        catch (NumberException e) {
            e.printStackTrace();
        }

    }
    protected static void printCountClassCreds() {
        out.printf ("Count of %s users - %d, %s", "SimpleCreds", countClassCreds, " \n");
    }
}