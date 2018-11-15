package pl.javastart.przyklady;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {
	public static void main(String[] args) {
		Integer[] numbers = { 300, 302, 100, 304, 50000, 6543, 7832, 45, 23, 65,300,203,506};
		System.out.println("Nieposortowana: ");
		for (Integer n : numbers) {
			System.out.println(n);
		}

		Arrays.sort(numbers);
		System.out.println("Posortowana Arrays.sort()");
		for (Integer n : numbers) {
			System.out.println(n);
		}
		printArray(numbers);

		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("Posortowana z Comparator");
		for (Integer n : numbers) {
			System.out.println(n);
		}
		printArray(numbers);

		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("Posortowana od najwiêkszej");
		for (Integer n : numbers) {
			System.out.println(n);
		}
		printArray(numbers);
	}

	public static <T> void printArray(T[] arr) {// metoda generyczna
		for (T t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

}
