package pl.javastart.zadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napiœnij Enter, aby zacz¹æ odmierzaæ czas.");
		sc.nextLine();
		Instant i1 = Instant.now();
		System.out.println("Napiœnij Enter, aby zakoñczyæ odmierzaæ czas.");
		sc.nextLine();//Metoda nextLine() skutecznie wstrzymuje dzia³anie programu a¿ do wciœniêcia przycisku Enter.

		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println("Ró¿nica czasu miêdzy enterami to : " + duration.getSeconds() + " sekund");
	}

}
