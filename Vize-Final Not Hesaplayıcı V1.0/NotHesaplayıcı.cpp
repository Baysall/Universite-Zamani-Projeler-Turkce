#include <stdio.h>
#include <conio.h>
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
 	//bunlar C de kodlar
 	getch();
 	return 0;
}

