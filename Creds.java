public class Creds {

        private int number;
       private String login;
       private String password;
       private int pwdlnght;
       private int existNum;

    public Creds (boolean thisisSimpleCreds) {}


    public Creds () {}


    public String getLogin() {
        System.out.println("Имя: " + login);
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        System.out.println("Пароль: " + password);
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public int getNumber(){
        System.out.println("Number: " + this.number);
        return number;
    }

    public void setNumber(int number) {
        number= this.number;
    }

//    int Numm () {
//        int num = 15;
//        return num;
//    }

    public int passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
        return pwdlnght;
    }

    void ent() {
        System.out.println("\nUser " + this.login + " credentials:");
        getLogin();
        getPassword();
    }
}
