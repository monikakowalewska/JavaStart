package pl.kobietydokodu.bazakotow.model;

import java.util.Scanner;

public class Bomba {
public static void main (String[] args){
	System.out.println("Podaj liczb� ca�kowit� dodatni�");
	int liczba1;
	Scanner odczyt=new Scanner (System.in);
	liczba1=odczyt.nextInt();
	
	do{
		System.out.println("Bomba wybuchnie za "+liczba1);
		liczba1--;
		
	}
	while(liczba1>0);
	System.out.println("Bum!!! Z p�tl� do-while");
	
	System.out.println("Podaj liczb� ca�kowit� dodatni�");
	int liczba2;
	liczba2=odczyt.nextInt();
	while(liczba2>0){
		System.out.println("Bomba wybuchnie za "+liczba2);
		liczba2--;
	}
	System.out.println("Bum!!! Z p�tl� while");
	
	System.out.println("Podaj liczb� ca�kowit� dodatni�");
	int liczba3;
	liczba3=odczyt.nextInt();
	for(int i=liczba3;i>0;i--){
		System.out.println("Bomba wybuchnie za "+liczba3--);
		}
/*	z javastart, kt�re nie dzia�a
 * for(liczba3=odczyt.nextInt(); liczba3>0; liczba3--)
	System.out.println("Bomba wybuchnie za "+liczba3);*/
		System.out.println("Bum!!! z p�tl� for");//by�o ci�ko...
}
}
