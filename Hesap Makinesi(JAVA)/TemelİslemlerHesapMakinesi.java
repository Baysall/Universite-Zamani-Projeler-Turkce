import java.util.Scanner;

public class TemelİslemlerHesapMakinesi {
    public static void main (String[]args){
        int a,b,c,toplama,cikarma,carpma,bolme;
        Scanner input=new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1-Toplama|2-Çıkarma|3-Çarpma|4-Bölme");
        a= input.nextInt();
        System.out.println("1.sayıyı giriniz: ");
        b= input.nextInt();
        System.out.println("2.sayiyi giriniz: ");
        c= input.nextInt();

        switch (a){
            case 1://toplama işlemi
                toplama=b+c;
                System.out.println("Sonuç= "+toplama);
                break;
            case 2://çıkarma işlemi
                cikarma=b-c;
                System.out.println("Sonuç= "+cikarma);
                break;
            case 3://çarpma işlemi
                carpma=b*c;
                System.out.println("Sonuç= "+carpma);
                break;
            case 4://bölme işlemi
                bolme=b/c;
                System.out.println("Sonuç= "+bolme);
                break;
        }
    }
}
