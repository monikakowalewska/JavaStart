package pl.javastart.zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		List<Integer> liczby = new ArrayList<>();
		List<Integer> wylosowane = new ArrayList<>();
		Lotto.generate(ints);
		Lotto.printCollection(ints);
		Lotto.pobierzLiczby(liczby);
		Lotto.randomize(ints,wylosowane);
		Lotto.checkResult(wylosowane,liczby);
	}

	private static void generate(List<Integer> ints) {
		for (int i = 1; i < 50; i++) {
			ints.add(i);
		}
		System.out.println("Iloœæ elementów na liœcie: " + ints.size());
		System.out.println("Liczby w kolejnoœci: ");
	}

	private static void randomize(List<Integer> ints,List<Integer> wylosowane) {
		Collections.shuffle(ints);
		System.out.println("Liczby pomieszane: ");
		Lotto.printCollection(ints);
		for(int i=0; i<6; i++)
			wylosowane.add(ints.get(i));//do nowej listy kopiujê 6 elementów
		System.out.println("Wylosowane:"+wylosowane);
		Collections.sort(wylosowane);
		System.out.println("Wylosowane posortowane:");
		Lotto.printCollection(wylosowane);
	}

	private static void pobierzLiczby(List<Integer> liczby) {
		for(int i=0;i<6;i++){
		Integer liczba;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê");
		liczba = odczyt.nextInt();
		if(liczba>=1&&liczba<=49){
		liczby.add(liczba);
		}else{
			System.out.println("Niepoprawna liczba");
			i--;
		}
		odczyt.close();
		}
		Collections.sort(liczby);
		System.out.println("Moje liczby to:"+liczby);

	}
	private static void checkResult(List<Integer> wylosowane,List<Integer> liczby){
		
		int position;
		int trafienie=0;
		for(int i=0;i<6;i++)
		{
			position = Collections.binarySearch(wylosowane,liczby.get(i));
			System.out.println((i+1) + " moja liczba jest w liœcie na " + position + " miejscu");
			System.out.println("liczba = " + liczby.get(i));
			if(position>=0){
				trafienie++;
			}
		}
		System.out.println("masz "+trafienie+" trafieñ");
	}

	private static void printCollection(List<Integer> ints) {
		
		for (Integer s : ints) {
			System.out.print(s + "; ");
		}
		System.out.println();
	}
}
