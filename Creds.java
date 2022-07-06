public abstract class Creds {

        private byte number;
       protected String login;
       protected String password;

    Start.Local l10n = new Start.Local();

    public Creds () {}

    public String getLogin() { //ToDo Почему 2 раза логин????
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    protected String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumber() {
        try {
            if (number < 1) {
                throw new Exception("Number can't be zero or negative"); //ToDo То же сообщение, если null. Need fix.
            }
        } catch (Exception exept2) {
            exept2.printStackTrace();
        }
        return number;
    }

    public void setNumber(int nnumber) {
        this.number = (byte) nnumber;
        }

    public abstract void DisplayNumber ();
    protected static void printCountClassCreds(){};

    protected void DisplayLogin () {
        System.out.println(this.login);
    }

    public void passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
    }

    void ent() {
        if (login!="Admin") { //ToDo Возможно реализовать через isAdmin
            System.out.println("User #" + this.getNumber() + ", " + this.getLogin() + "; pass: " + getPassword());
        }
        else
            System.out.println("Admin, pass: " + getPassword().hashCode());
    }
    public void bigPass() {
        try {
            int x = this.getPassword().length();
            StringBuilder TLPass = new StringBuilder("Too long password on user ");
            TLPass.append(this.login);
            if (x > 13) {
                throw new Exception(String.valueOf(TLPass));
            }
        } catch (Exception exep1) {
           // exep1.printStackTrace();
        }
    }

    public void classSelector () { //ToDo Make class selector function for passwords.

        String a;
        a = String.valueOf(this.password.getClass());

        if (a.equals("class java.lang.String")) {
            System.out.println(a);
        } else
        System.out.println("Fuck.. " + a);
    }

    }
