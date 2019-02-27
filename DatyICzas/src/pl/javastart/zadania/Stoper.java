package pl.javastart.zadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napi�nij Enter, aby zacz�� odmierza� czas.");
		sc.nextLine();
		Instant i1 = Instant.now();
		System.out.println("Napi�nij Enter, aby zako�czy� odmierza� czas.");
		sc.nextLine();//Metoda nextLine() skutecznie wstrzymuje dzia�anie programu a� do wci�ni�cia przycisku Enter.

		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println("R�nica czasu mi�dzy enterami to : " + duration.getSeconds() + " sekund");
	}

}
