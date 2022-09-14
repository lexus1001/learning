public abstract class Creds {

    private byte number;
    protected String login;
    protected String password;

    Start.Local l10n = new Start.Local();

    public Creds () {}

    public String getLogin() { //ToDo Почему 2 раза логин????// Fixed(?)
        return login;
    }
    public final void setLogin(String login) {
        this.login = login;
    }

    protected String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int nnumber) {
        this.number = (byte) nnumber;
        }

    public abstract void DisplayNumber();
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
                throw new bigPassException(String.valueOf(TLPass));
            }
        } catch (bigPassException exep1) {
            exep1.printStackTrace();
        }
    }

    }
