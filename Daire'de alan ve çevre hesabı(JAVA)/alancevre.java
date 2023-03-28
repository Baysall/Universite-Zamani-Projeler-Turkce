import java.util.Scanner;

public class alancevre {
    public static void main (String[] args){
        Scanner veri=new Scanner(System.in);
        int r;
        float pi=3.14f,cevre,alan;
        System.out.println("Dairenin yaricapini giriniz: ");
        r=veri.nextInt();

        cevre=2*pi*r;
        alan=pi*r*r;

        System.out.println("\nDairenin alani: "+alan);
        System.out.println("\nDairenin cevresi: "+cevre);
    }
}
