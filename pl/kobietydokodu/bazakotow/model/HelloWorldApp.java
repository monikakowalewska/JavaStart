package pl.kobietydokodu.bazakotow.model;

public class HelloWorldApp {
public static void main (String[] args){
	/*to jest test komentarza*/
	//System.out.println("Monika");
	System.out.println("Ania");
	System.out.println("Bartek");
	System.out.println("Kasia");
	
	String hello = "Witaj ";
	String world = "Œwiecie!";
	String powitanie = hello+world; //³¹czenie Stringów
	System.out.println(powitanie);
	String czesc = powitanie.substring(0, 6)+"uczniu";
	System.out.println(czesc);
	
	int liczba1 = 5;
	int liczba2 = liczba1;
	System.out.println(liczba1+liczba2);
	double liczba3, liczba4;
	liczba3 = 5.0;
	liczba4 = 3.3;
	System.out.println(liczba3);
	System.out.println(liczba4);
	
	final double liczbaPi=3.14;
	final int ostatecznaLiczba=33;
	// nie mo¿na drugi raz zadeklarowaæ zmiennej finalnej int ostatecznaLiczba=32;
	float wiek=32.5f;
	byte liczba5=4;
	String imie1="Monia";
	String czasownik="lubi";
	String sport="plywanie";
	String zdanie =(imie1+" "+czasownik+" "+sport);
	String polZdania= zdanie.substring(0,10);
	boolean wynik=(liczba5>3);
	short liczba6=7;
	long liczba7=-2;
	char sprawdzenieDzialania='A';
	System.out.println(sprawdzenieDzialania);
	System.out.println(wynik);
	System.out.println("Pi "+liczbaPi);
	System.out.println(ostatecznaLiczba);
	System.out.println("Wiek "+wiek);
	System.out.println(imie1);
	System.out.println("Napisz ca³e zdanie "+zdanie);
	System.out.println(polZdania);
	
}
}
