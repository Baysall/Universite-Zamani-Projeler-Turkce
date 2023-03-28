import java.util.Scanner;
public class NotOrtalamaHesaplayici {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int vize,finale,etki1,etki2,islem;

        System.out.println("Vize notunuzu giriniz: ");
        vize= input.nextInt();

        System.out.println("Final notunuzu giriniz: ");
        finale= input.nextInt();
        System.out.println("Vize etkisini giriniz(%..etki): ");
        etki1= input.nextInt();

        if(etki1>100) {

            System.out.println("Etki değeri 100 den fazla olamaz,tekrar giriniz.");
            System.out.println("Vize etkisini giriniz(%..etki): ");
            etki1= input.nextInt();
        }
        etki2=100-etki1;
        vize=(vize*etki1)/100;
        finale=(finale*etki2)/100;
        islem=vize+finale;
        System.out.println("Gecme notunuz: "+islem);

    }
}
