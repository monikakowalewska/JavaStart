package pl.javastart.przyklady;

import java.util.Scanner;

public class ForEachProblem {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int tmp: numbers) {
			System.out.println("Podaj liczb�");
			tmp = sc.nextInt();
		}
		
		for(int tmp: numbers) {
			System.out.println(tmp);
		}
		
		sc.close();
	}//kolejne liczby przypisywali�my do zmiennej tmp, a nie do bezpo�rednio do tablicy.

}
