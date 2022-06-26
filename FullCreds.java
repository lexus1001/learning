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
    protected static void printCountClassCreds() {  //ToDo *Bug* MegaFullCreds-пользователи считаются при подсчёте пользователей FullCreds
       StringBuilder full_count = new StringBuilder("Full count users in ");
        full_count.append("FullCreds");
        full_count.append(" = ");
        full_count.append(countClassCreds);
        System.out.println(full_count.toString());

    }
    @Override
    public void DisplayNumber() {
        System.out.printf("Number of user %-2s %1s %d \n", this.login, " is ", this.getNumber());
    }

}



