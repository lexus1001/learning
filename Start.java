import Interfaces.DB;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start {

    public static void main(String[] args) //throws IOException
    {

        Logger MainFile = Logger.getLogger("NotAnon Loger");
        int un;
        Local ua = new Local();
        Local ru = new Local();
        Local ee = new Local();
        ua.setLocal(331, "Ukraine");
        ru.setLocal(7, "Russia");
        ee.setLocal(05, "Eesti");
        Local.DESCRIPTION = "Local";

        SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yy");
        Date now = new Date();

        StringBuilder time = new StringBuilder();
        time.append("Today is ").append(simpleDate.format(System.currentTimeMillis())).append(" and math = ").append(ee.hashCode());
        float mt = (float) Math.round(Math.pow(1.1, 16));
        double mtt = Math.random();
        System.out.printf(time.toString() + "%.3f, %f\n", mt, mtt);
        System.out.println("Full time is " + now);

        @Deprecated
        String[] loginsOld = {"admin", "lexus100", "Alex", "Nikolya", "Marta", "Zina", "Ira", "Denis"};
        String[] logins = new String[8];
        int nmbrs = logins.length;
        String[] passwords = new String[nmbrs];
        String[] banned = new String[nmbrs];

        int counter = 0;
        String seprtr = File.separator;
        String IFL = "o:" + seprtr + "Development" + seprtr + "logins.cpd";
        String IFP = "o:" + seprtr + "Development" + seprtr + "passwords.cpd";
        String IFB = "o:" + seprtr + "Development" + seprtr + "banned.cpd";
        File loginsFile = new File(IFL);
        File passwordsFile = new File(IFP);
        File bannedFile = new File (IFB);
        try {

            Scanner InFL = new Scanner(loginsFile);
            String IFLF = InFL.nextLine();

            System.out.print("\nInitial list of logins: ");
            String[] InitialLogins = IFLF.split(", ", 8);
            for (String IL : InitialLogins) {
                logins[counter++] = String.valueOf(IL);
                System.out.print("\t" + logins[counter - 1]);
            }
            InFL.close();
        } catch (Exception e0) {
            MainFile.log(Level.WARNING, "File " + loginsFile.getName() + " doesn't exist.");
        }

        try {

            Scanner InFP = new Scanner(passwordsFile);
            String IFLP = InFP.nextLine();

            String[] InitialPasswords = IFLP.split(", ", 8);
            for (String IP : InitialPasswords) {
                passwords[counter++] = String.valueOf(IP);
            }
            InFP.close();
        } catch (Exception e1) {
            MainFile.log(Level.WARNING, "File " + passwordsFile.getName() + " doesn't exist.");
        }
        // System.out.println(Arrays.toString(InitialLogins));
        //}

        SimpleCreds lexus100 = new SimpleCreds(3);
        SimpleCreds Alex = new SimpleCreds(logins[2], 1234558900, true); //ToDo *Bug* Exeptoin >13 doesn't work on SimpleCreds users
        SimpleCreds Diman = new SimpleCreds("Dima", 766847363, true); //ToDo *Bug* Выяснить почему если поставить лонг, то ошибка, хотя нигде не int
        FullCreds Denis = new FullCreds();
        FullCreds Nikolya = new FullCreds(20, logins[3], "3338479hgnhgnrhrgn", false);
        FullCreds Marta = new FullCreds(4, logins[4], "qwer5y67", true);
        FullCreds Zina = new FullCreds(7, "Zinna", "5555", false);
        //Creds Zina = new SimpleCreds(7);
        MegaFullCreds Ira = new MegaFullCreds(5, logins[6], "", false, false);
        MegaFullCreds admin = new MegaFullCreds(0, "Admin", "123456789", false, true) {

            @Override
            public void passwordLenght() {
                System.out.println("Odmen password lenght = " + (password.length() - getCCC()));
                this.l10n.setLocal(0, "World");
            }
        };

        lexus100.l10n.setLocal(6, "Armenia");
        Alex.l10n.setLocal(352, "Whiterussia");
        Marta.l10n.setLocal(12, "");

        @Deprecated
        byte i = 0;
        System.out.println("\nAll users list: ");
        for (String logeens : loginsOld) {
            if (i < (loginsOld.length - 1)) {
                System.out.print(loginsOld[i] + "; ");
                i++;
            } else {
                System.out.print(loginsOld[i] + ". ");
            }
        }
        System.out.printf("\nFull count of users: %d", loginsOld.length);
        System.out.printf("\nFull count of users in file: %d", logins.length);

        String u;
        String p;
        String b;
        System.out.println("\n\tPlease enter user number ");
        Scanner Number = new Scanner(System.in);
        un = Integer.parseInt(String.valueOf(Number.nextInt()));
        try {
            if (un < 0) {
                throw new NegativeArraySizeException("Не может быть меньше нуля");
            } else if (un > loginsOld.length) {
                throw new ArrayIndexOutOfBoundsException("Too big num");
            } else if (logins[un].isEmpty()) { //ToDo Если не воспроизводится условия if, то throw не выполняется.
                throw new InputMismatchException("fdg");
            }
            {
                System.out.println(logins[un]);
                u = logins[un];
                p = passwords[un];
                b = banned[un];
                System.out.println("User login: " + u);
                System.out.println("Password: " + p);
                System.out.println("Banned? " + b);
            }
        } catch (ArrayIndexOutOfBoundsException excep) {
            excep.printStackTrace();
            System.out.println("\tPlease enter login: ");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        } catch (NegativeArraySizeException exep_arr_n) {
            exep_arr_n.printStackTrace();
            System.out.println("\tPlease enter loggin: ");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        } catch (InputMismatchException exep_arr_i) {
            //exep_arr_i.printStackTrace();
            System.out.println("Некорректно введён номер, укажите имя пользователя");
            Scanner User = new Scanner(System.in);
            u = User.nextLine();
        }
//        do
//        { //ToDo Сделать работающий do_while
//        continue; }
        //while (u.equals('q')) {

            switch (u) { //ToDo *feature* Игнорировать размер букв
                case "admin":
                    admin.ent();
                    admin.passwordLenght();
                    admin.l10n.loc();
                    admin.setAdmin(true);
                    break;
                case "lexus100":
                    lexus100.bigPass();
                    lexus100.DisplayNumber();
                    //System.out.println(l);
                    lexus100.l10n.loc();
                    SimpleCreds.printCountClassCreds();
                    break;
                case "Alex":
                    fullInfo(Alex);
                    SimpleCreds.printCountClassCreds();
                    Alex.bigPass();
                    break;
                case "Nikolya":
                    fullInfo(Nikolya);
                    ee.loc();
                    Nikolya.isBanned();
                    FullCreds.printCountClassCreds();
                    Nikolya.bigPass();
                    break;
                case "Marta":
                    fullInfo(Marta);
                    Marta.isBanned();
                    Marta.printCountClassCreds();
                    break;
                case "Zina":
                    SimpleCreds.printCountClassCreds();
                    try {
                        if (Zina.getNumber() == 6) {
                            System.out.println(Zina.getLogin());
                        }
                    } catch (Exception exep2) {
                        System.out.println("No login for Zina");
                    }
                    Zina.passwordLenght();
                    break;
                case "Ira":
                    Ira.ent();
                    Ira.isBanned();
                    Ira.passwordLenght();
                    Ira.bigPass();
                    // System.out.println(ir);
                    Ira.printCountClassCreds();
                    Ira.setAdmin(false);
                    Ira.hasMail();
                    break;
                case "Denis":
                    String DenPath = "o:" + seprtr + "Development" + seprtr + "Credentials" + seprtr + logins[un] + ".txt";
                    // File Den = new File (loginsFile[7] + ".txt");
                    File Den = new File(DenPath);
                    Scanner DenFile = null;
                    try {
                        DenFile = new Scanner(Den);
                    } catch (FileNotFoundException e) {
                        //throw new RuntimeException(e);
                        MainFile.log(Level.WARNING, "File not found!"); //ToDo Get file name or path
                    }
                    while (DenFile.hasNextLine()) {
                        String DenStr = DenFile.nextLine();
                        System.out.println(DenStr);
                    }
                    DenFile.close();
                    break;
                default:
                    System.out.println("No info");
                    break;
            }
        }
    static class Local {
        private String country;
        private int code;
        public static String DESCRIPTION;

        public Local() {
            setLocal(code, country);
        }
        void setLocal(int code, String ccountry) {
            this.code = code;
            country = ccountry;
        }
        public Object getCode() {
            return code;
        }
        public String getCountry() {
            return country;
        }
        @Deprecated
        void loc() {
            if ((country.equals("Russia") | country == "Ukraine") & code >= 7) {
                System.out.println(DESCRIPTION + ": " + this.getCountry() + " (telephone code: +" + this.getCode() + ")");
            } else if (country.isEmpty()) {
                System.out.println("Country name needed");
            } else
                System.out.println(DESCRIPTION + " " + getCountry() + " is permitted");
        }
    }
    public static void fullInfo (@NotNull Creds admin) {
        //admin.DisplayLogin();
        admin.DisplayNumber();
        admin.passwordLenght();
        admin.ent();
        admin.bigPass();
        admin.classSelector();
    }
}




