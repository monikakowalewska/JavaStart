package pl.javastart.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		int number = 0;
		try {
			number = sc.nextInt();
		} catch(InputMismatchException ex) {
			System.err.println("Podana wartoœæ nie jest liczb¹ ca³kowit¹");//kod bêdzie wyró¿niony na czerwono dziêki err
			ex.printStackTrace();
		}
		System.out.println("Poda³eœ: " + number);
		sc.close();
	}

}
