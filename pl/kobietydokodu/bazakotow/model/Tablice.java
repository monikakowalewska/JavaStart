package pl.kobietydokodu.bazakotow.model;

import java.util.Scanner;

public class Tablice {
	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);
		String[] tablica = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Podaj imie ");
			String imie = odczyt.nextLine();
			tablica[i] = imie;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Witaj " + tablica[i]);
			
		}
		
		
		System.out.println("Z ilu elementów ma siê sk³adaæ tablica? Podaj liczbê ca³kowit¹.");
		int n=odczyt.nextInt();
		int tab[]=new int[n];
		System.out.println("Tablica sk³ada siê z elementów "+n);
		
		for(int i=0;i<n;i++)
			tab[i]=i+1;
		for(int x : tab)//for each wypisanie elementów
			System.out.println(x);
		
		int i=0;
		/*tab[i]=i+1;*/
		while(i<n){
			System.out.println("Miejsce w tabeli to "+i+" a liczba to "+tab[i]);
			i++;
			
			}	
		/*System.out.println(" 5 miejsce tablicy to "+tab[5]);*/
		
		
	}

}
