public abstract class Creds {

        private int number;
       protected String login;
       protected String password;

    public Creds () {}

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    protected String getPassword() {
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
    public abstract void DisplayNumber ();
    protected abstract void printCountClassCreds();

    protected void DisplayLogin () {
        System.out.println(this.getLogin());
    }

    public void passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
    }

    void ent() {
        System.out.println("User #" + this.getNumber() + ", " + this.getLogin() + "; pass: " + getPassword());
    }
}
