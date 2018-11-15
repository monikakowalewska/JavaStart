package pl.javastart.zadania;

import java.util.Scanner;

public class Choinka {
	public static void main(String[] args) {
		System.out.println("Podaj liczbê naturaln¹");
		int liczba;
		Scanner odczyt = new Scanner(System.in);

		liczba = odczyt.nextInt();

		System.out.println("Podana liczba to  " + liczba);
		char znakGwiazdki = '*';
		for (int i = 0; i < liczba; i++) {
			for (int j = 0; j < liczba * 2; j++) {
				if (j < (liczba - i) || j > (liczba + i)) {
					System.out.print(" ");
				} else {
					System.out.print(znakGwiazdki);
				}
			}
			System.out.println();
		}
		odczyt.close();
	}
}
