package pl.javastart.zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {

	public static ArrayList<Integer> wczytaj(ArrayList<Integer> ints) {//funkcja rekurencyjna
		System.out.println("Podaj liczbê lub wpisz exit");
		Scanner odczyt = new Scanner(System.in);
		String dane = null;
		dane = odczyt.nextLine();

		if (dane.equals("exit")) {
			odczyt.close();
			return ints;
		}

		Integer liczba = Integer.parseInt(dane);
		ints.add(liczba);

		return wczytaj(ints);
	};

	public static void main(String[] args) {


		ArrayList<Integer> ints = new ArrayList<>();
		int suma=0;
		Suma.wczytaj(ints);
		
		for (Integer num : ints) {
			System.out.println(num);
			suma+=num;		
		}
		System.out.println(suma);
	}
}
