public class Rabota {

    private String name;
    private long num;
    private int ZP;
    private boolean noOnlyRussia;
    private boolean Relocate;
    private String Collegues;

    Rabota (){}
    Rabota (String name, long num, int ZP, boolean noOnlyRussia, boolean Relocate, String Collegues) {
        this.name = name;
        this.num = num;
        this.ZP = ZP;
        this.noOnlyRussia = noOnlyRussia;
        this.Relocate = Relocate;
        this.Collegues = Collegues;
    }
    void getName(){
        System.out.println(name);
    }
    void getNum(){
        System.out.println(num);
    }
    void getZP() {
        System.out.println(ZP);
    }
    void getColl(){
        System.out.println(Collegues);
    }
    void Res() {
        System.out.print("№ ");
        this.getNum();
        this.getName();
        System.out.print("Зарплата: ");
        this.getZP();
        System.out.print("Можно работать только из России: ");
        if (this.noOnlyRussia == false) {
            System.out.println("Да");
        }
        else
            System.out.println("Нет");
        System.out.print("Есть перспектива релокации: ");
        if (this.Relocate == true) {
            System.out.println("Да");
        }
        else System.out.println("Нет");
        System.out.print("Коллеги - ");
        this.getColl();

        if (Collegues.equals("Good")||Collegues.equals("Fine!") & this.noOnlyRussia==true) {
            System.out.println("Ok");
        }
        else
            System.out.println("Уволиться?");
    }
}
