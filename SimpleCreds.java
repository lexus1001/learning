import org.testng.annotations.Test;

public class SimpleCreds extends Creds {

    int number;


    public SimpleCreds (int number) {
        setNumber(number);
    }
    public SimpleCreds(String login, int pwd, boolean thisIsSimpleCreds) {
        setLogin(login);
        setPassword(String.valueOf(pwd));
    }

    public SimpleCreds(boolean thisIsSC) {
        super(thisIsSC);
    }
    @Test
    public void FirstTest() {

    }

//    @Override
//    public int getNumber() {
//        return super.getNumber();
//    }

    @Override
    void DisplayNumber() {
        System.out.println("Number of this user equals " + this.getNumber() );
    }
    @Override
    public String getPassword() {
        String simplePass = super.getPassword();
        return "Pass: " + simplePass;
    }
    void isSimpleCreds() {
            System.out.println("This is SimpleCreds");
        }

}
