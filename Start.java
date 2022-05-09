import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Rabota uTest = new Rabota("uTest", 0, 12100,true,false,"I don't know");
        Rabota SimbirSoft = new Rabota ("SimbirSoft",1,48000,false,false,"Fine!");
        Rabota NeoTech_Development = new Rabota ("NeoTech Development",2,100000,true,true, "Good");

        Scanner Rab = new Scanner(System.in);
        System.out.print("Please enter work number\n " );

        int n = Rab.nextInt();
        if (n==1)
       {
        SimbirSoft.Res();
        }
        else if (n==2){
            NeoTech_Development.Res();
        }
        else if (n==0) {
            uTest.Res();
        }
        else
        System.out.println("No information");
    }

}
