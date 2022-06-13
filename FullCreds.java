import java.util.Scanner;

public class FullCreds extends Creds {

    public boolean banned;

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

   public boolean getBanned() {
        return banned;
   }

    void isBanned () {
        if (this.getBanned()) {
            System.out.println("This user is banned");
        }
        else {
           System.out.println("All Ok");
        }
    }

    public FullCreds(int number, String login, String password, boolean banned) {

        setLogin(login);
        setPassword(password);
        setNumber(number);
        setBanned(banned);
    }
    public  FullCreds () {}


    }



