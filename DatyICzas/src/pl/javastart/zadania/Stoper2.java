package pl.javastart.zadania;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper2 {
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("�eby rozpocz�� pomiar czasu wci�nij ENTER");
	            sc.nextLine();
	            Instant i1 = Instant.now();

	            System.out.println("�eby zatrzyma� pomiar czasu wci�nij ENTER");
	            sc.nextLine();
	            Instant i2 = Instant.now();

	            Duration time = Duration.between(i1, i2);
	            System.out.println("Czas, kt�ry up�yn��: " + time.getSeconds());
	        }
	    }

}
