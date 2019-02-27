package pl.javastart.zadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper2 {
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("¯eby rozpocz¹æ pomiar czasu wciœnij ENTER");
	            sc.nextLine();
	            Instant i1 = Instant.now();

	            System.out.println("¯eby zatrzymaæ pomiar czasu wciœnij ENTER");
	            sc.nextLine();
	            Instant i2 = Instant.now();

	            Duration time = Duration.between(i1, i2);
	            System.out.println("Czas, który up³yn¹³: " + time.getSeconds());
	        }
	    }

}
