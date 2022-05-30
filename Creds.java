public class Creds {

        private int number;
       private String login;
       private String password;
       private int pwdlnght;
       private boolean banned;



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

//    public void setPassword(int password1) {
//        this.password1 = password1;
//    }


    public Integer getNumber(){
        System.out.println(number);
        return number;
    }

    public void setNumber(int number) {
        number= this.number;
    }

    public int passwordLenght () {
        System.out.println(this.login + " password lenght = " + password.length());
        return pwdlnght;
    }


}
