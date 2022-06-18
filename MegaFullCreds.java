import java.util.Objects;

public class MegaFullCreds extends FullCreds {

     private static int countClassCreds;

    public MegaFullCreds (int number, String login, String password, boolean banned, boolean admin){
        setLogin(login);
        setPassword(password);
        setNumber(number);
        setBanned(banned);
        countClassCreds++;
    }

    protected void printCountClassCreds() {
               System.out.println("Общее количество пользователей с флагом MegaFull = " + countClassCreds);
    }
    @Override
    public void setBanned (boolean banned) {
        if (Objects.equals(login, "Ira")) {
            this.banned = true;
        }
        else
            this.banned = banned;
    }

    @Override
    public void passwordLenght () {
        if (password.isEmpty()) {
            System.out.println("Пароль не установлен");
        }
        else {
            System.out.println("Pass lenght for user " + this.getLogin() + " = " + this.password.length());
        }
    }

}
