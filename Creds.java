public class Creds {

        private int number;
       private String login;
       private String password;
       private int password1;
       private boolean banned;



   //public Creds(int number, String login, String password, boolean banned) {}
//    public Creds(int number, String login, int password, boolean banned) {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(int password) {
        this.password1 = password;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        number= this.number;
    }

    public int passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
        return password1;
    }


}
