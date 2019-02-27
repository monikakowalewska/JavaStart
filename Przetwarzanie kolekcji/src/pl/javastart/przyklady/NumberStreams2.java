package pl.javastart.przyklady;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreams2 {
public static final int DIVIDER = 10;
	
	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
		// lista kwadratów kolejnych 100 liczb ca³kowitych
		List<Integer> squareNumbers = numStream.map(NumberStreams2::square)
												.limit(100)
												.collect(Collectors.toList());
		//zbiór kwadratów liczb
		Set<Integer> biggerThan5 = squareNumbers.stream()
												.filter(NumberStreams2::isDividedBy)
												.map(NumberStreams2::divide)
												.collect(Collectors.toCollection(TreeSet<Integer>::new));

		System.out.println("List");
		squareNumbers.forEach(x -> System.out.print(x + " ; "));
		System.out.println("\nSet");
		biggerThan5.forEach(x -> System.out.print(x + " ; "));
	}
	
	public static int square(int x) {
		return x*x;
	}
	
	public static boolean isDividedBy(int x) {
		return x%DIVIDER == 0;
	}
	
	public static int divide(int x) {
		return x/DIVIDER;
	}
}
