package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers = numbers.stream()//tworzymy strumie�
			/*	.filter(x -> x%2 == 0)//wyfiltrowa� tylko liczby podzielne przez 2
				.filter(x -> x>5)//uzyska� liczby wi�ksze od 5
*/		.filter(x -> x%2 == 0 && x>5) ///*koniunkcja: 
		.collect(Collectors.toCollection(ArrayList::new));
		numbers.forEach(System.out::println);
	}
}
