package pl.javastart.zadania03;

import java.util.Scanner;

import pl.javastart.zadania.Patient;
import pl.javastart.zadania02.Hospital;

public class HospitalApp {
	
	
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		int x;
		System.out.println("Wybierz 0 jeœli chcesz wyjœæ z programu.Wybierz 1 jeœli chcesz dopisaæ pacjenta. "
				+ "Wybierz 2 jeœli chcesz wyœwietliæ listê pacjentów ");
		x = odczyt.nextInt();
		Hospital hosp = new Hospital();

		while (x != 0) {
			switch (x) {
			case 1:

				Patient patient = new Patient(null, null, x);
				hosp.dopiszPacjenta(patient);
				break;
			case 2:
				hosp.print();
				break;
			default:
				System.out.println("Nie znaleziono takiej opcji");

			}
			
			System.out.println("Wybierz 0 jeœli chcesz wyjœæ z programu.Wybierz 1 jeœli chcesz dopisaæ pacjenta. "
					+ "Wybierz 2 jeœli chcesz wyœwietliæ listê pacjentów ");
			x = odczyt.nextInt();
		}
		System.out.println("Koniec programu");
		odczyt.close();

	}
}
