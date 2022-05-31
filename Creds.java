public class Creds {

        private int number;
       private String login;
       private String password;
       private int pwdlnght;
       private int existNum;
       private boolean banned;

    public Creds (boolean thisisSimpleCreds) {

    }

    public  Creds () {

    }


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
        System.out.println("Number: " + number);
        return number;
    }

    public void setNumber(int number) {
        number= this.number;
    }

    public void Num () {
        System.out.println(this.number);
        //return existNum;
    }

    public int passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
        return pwdlnght;
    }

    void ent() {
        System.out.println(getLogin()+ " : " + getPassword());
    }
}
