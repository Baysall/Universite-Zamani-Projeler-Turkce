#include <stdio.h>
#include <conio.h>
//Buradaki kodlarda vize sınavı etkisi %40,final etkisi %60 olarak alınmış olunup sayısal olarak hangi notla geçeceğinizi size verir.
int main()
{ int vize,final,top1,top2,top3,x,y,z;

 	printf("Vize notunuzu giriniz: \n");
 	scanf("%d",&vize);

 	printf("Final notunuzu giriniz: \n");
 	scanf("%d",&final);
 
 	top1=vize*40/100;
 	top2=final*60/100;
 	top3=top1+top2;
 	
 	printf("100 uzerinden geçme notu:%d",top3);
 
 	getch();
 	return 0;
}


