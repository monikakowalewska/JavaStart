package pl.javastart.zadania;

import java.util.Locale;
import java.util.Scanner;

public class ZadaniePetle {
public static void main(String[] args) {
	double a;
	
	Scanner odczyt = new Scanner(System.in);
	odczyt.useLocale(Locale.US);

	
	System.out.println("Ile liczb chcesz wprowadzi�? Podaj liczb� ca�kowit�");
	a=odczyt.nextInt();//mimo �e a jest double to nextInt mo�e by�, bo i tak ca�kowita
	
	System.out.println("Brawo poda�e� liczb� ca�kowit�");
	double suma=0;
	for(int x=0;x<a;x++){
		System.out.println("Podaj liczb�(zamiast przecinka wpisz kropk�, bo si� program wychrzani)");
		a=odczyt.nextDouble();
		suma+=a;
	}
	System.out.println("Suma wszystkich liczb to "+suma);
	odczyt.close();

}
}
