package pl.kobietydokodu.bazakotow.model;

import java.util.Scanner;

public class Bomba {
public static void main (String[] args){
	System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
	int liczba1;
	Scanner odczyt=new Scanner (System.in);
	liczba1=odczyt.nextInt();
	
	do{
		System.out.println("Bomba wybuchnie za "+liczba1);
		liczba1--;
		
	}
	while(liczba1>0);
	System.out.println("Bum!!! Z pêtl¹ do-while");
	
	System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
	int liczba2;
	liczba2=odczyt.nextInt();
	while(liczba2>0){
		System.out.println("Bomba wybuchnie za "+liczba2);
		liczba2--;
	}
	System.out.println("Bum!!! Z pêtl¹ while");
	
	System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
	int liczba3;
	liczba3=odczyt.nextInt();
	for(int i=liczba3;i>0;i--){
		System.out.println("Bomba wybuchnie za "+liczba3--);
		}
/*	z javastart, które nie dzia³a
 * for(liczba3=odczyt.nextInt(); liczba3>0; liczba3--)
	System.out.println("Bomba wybuchnie za "+liczba3);*/
		System.out.println("Bum!!! z pêtl¹ for");//by³o ciê¿ko...
}
}
