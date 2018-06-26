package pl.javastart.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczb�: ");
		int number = 0;
		try {
			number = sc.nextInt();
		} catch(InputMismatchException ex) {
			System.err.println("Podana warto�� nie jest liczb� ca�kowit�");//kod b�dzie wyr�niony na czerwono dzi�ki err
			ex.printStackTrace();
		}
		System.out.println("Poda�e�: " + number);
		sc.close();
	}

}
