package pl.kobietydokodu.bazakotow.model;

import static java.lang.Math.*;

public class Funkcje {
	public static void main(String[] args){
		double liczba = 9.0;
		int c = 3;
		double pierwiastek = Math.sqrt(liczba);
		double potega = Math.pow(liczba, c);
		System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
		System.out.println("Liczba "+liczba+" podniesiona do potegi "+c+" to "+potega);
		
		int a=-18;
		int b=4;
		double potega2=Math.pow(a,b);
		double wartoscBezwzgledna=Math.abs(a);
		double pierwiastek2= Math.sqrt(potega2);
		System.out.println("Liczba a "+a+" podniesiona do potêgi b "+b+ " to "+potega2);
		System.out.println("Wartoœæ bezwzglêdna liczby a "+a+" wynosi: "+wartoscBezwzgledna);
		System.out.println("Pierwiastek z liczby a podniesionej do potêgi b wynosi: "+pierwiastek2);
		System.out.println(pow(a,b));//bez deklaracji zmiennej
		System.out.println(abs(a));
		System.out.println(sqrt(pow(a,b)));
	
		
		}
}
