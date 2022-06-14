public class Creds {

        private int number;
       protected String login;
       protected String password;


    public Creds (boolean thisIsSimpleCreds) {
       // this (ClassValue);
    };
    public Creds (int number) {
        setNumber(number);
    }
    public Creds () {}

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String ppassword) {
        this.password = ppassword;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int nnumber) {
        this.number= nnumber;
    }
    void DisplayNumber () {
        System.out.println("Number of " + this.login + " is " + this.getNumber());
    }

    public void passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
    }

    void ent() {
        System.out.println("User #" + this.getNumber() + ", " + this.getLogin() + "; pass: " + getPassword());
    }
}
