import java.util.Scanner;

public class FullCreds extends Creds {

    private boolean banned;

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean isBanned() {
        if (banned) {
            System.out.println("User banned");
        }
        return banned;
    }

    public FullCreds(int number, String login, String password, boolean banned) {

        setLogin(login);
        setPassword(password);
        setNumber(number);
    }


    }



