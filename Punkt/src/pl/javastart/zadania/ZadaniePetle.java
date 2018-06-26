package pl.javastart.zadania;

import java.util.Locale;
import java.util.Scanner;

public class ZadaniePetle {
public static void main(String[] args) {
	double a;
	
	Scanner odczyt = new Scanner(System.in);
	odczyt.useLocale(Locale.US);

	
	System.out.println("Ile liczb chcesz wprowadziæ? Podaj liczbê ca³kowit¹");
	a=odczyt.nextInt();//mimo ¿e a jest double to nextInt mo¿e byæ, bo i tak ca³kowita
	
	System.out.println("Brawo poda³eœ liczbê ca³kowit¹");
	double suma=0;
	for(int x=0;x<a;x++){
		System.out.println("Podaj liczbê(zamiast przecinka wpisz kropkê, bo siê program wychrzani)");
		a=odczyt.nextDouble();
		suma+=a;
	}
	System.out.println("Suma wszystkich liczb to "+suma);
	odczyt.close();

}
}
