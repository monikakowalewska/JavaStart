package pl.javastart.przyklady;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int number = 500;
		int userInput;
		System.out.println("Zgadnij liczb�");
		
		while((userInput = reader.nextInt()) != number) {
			if(userInput > number) {
				System.out.println("Podana liczba jest za du�a, zgaduj dalej!");
			} else {
				System.out.println("Podana liczba jest za ma�a, zgaduj dalej!");
			}
		}
		
		System.out.println("Brawo, zgad�e� o jak� liczb� chodzi�o, wygrywasz z�ote kalesony");
		
		reader.close();
	}

}
