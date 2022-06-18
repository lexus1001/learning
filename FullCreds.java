import java.util.Scanner;

public class FullCreds extends Creds {

    public boolean banned;
    private static int countClassCreds;

    public FullCreds() {
        countClassCreds++;
    }
    protected FullCreds(int number, String login, String password, boolean banned) {

        setLogin(login);
        setPassword(password);
        setNumber(number);
        setBanned(banned);
        countClassCreds++;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean getBanned() {
        return banned;
    }
    void isBanned() {
        if (this.getBanned()) {
            System.out.println("This user is banned");
        } else {
            System.out.println("All Ok");
        }
    }
    protected void printCountClassCreds() {
        System.out.println("Full count users in FullCreds = " + countClassCreds);
    }
    @Override
    public void DisplayNumber() {
        System.out.println("Number of user " + this.login + " is " + this.getNumber());
    }

}



