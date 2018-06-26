package pl.javastart.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb�: ");
		int number = 0;
		boolean error = true;
		while (error) {
			try {
				number = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nie poda�e� liczby ca�kowitej, spr�buj jeszcze raz: ");
				sc.nextLine();
			}
		}
		System.out.println("Poda�e�: " + number);
		sc.close();
	}

}
