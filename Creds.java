public class Creds {

        private int number;
       protected String login;
       protected String password;
       private int pwdlnght;


    public Creds (boolean thisisSimpleCreds) {};
    public Creds (int number) {
        setNumber(number);
    }
    public Creds () {}

    public String getLogin() {
        System.out.println("Имя: " + login);
        return login;
    }
    public void setLogin(String llogin) {
        this.login = llogin;
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
        System.out.println("Number of " + this.getLogin() + " is " + this.getNumber());
    }

    public void passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
    }

    void ent() {
        System.out.println("User #" + this.getNumber() + ", " + this.getLogin() + "; pass: " + getPassword());
    }
}
