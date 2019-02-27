package pl.javastart.przyklady;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberStream3 {
	public static final int DIVIDER = 10;
	public static void main(String[] args) {
		// lista kwadratów kolejnych 100 liczb ca³kowitych
		List<Integer> squareNumbers = IntStream.range(0,  100)//generuje liczby od 0 do 99
												.map(NumberStream3::square)
												.boxed()//przekszta³ciæ strumieñ w typ Stream<Integer> 
												.collect(Collectors.toList());//i  przerobiæ na listê
		//zbiór kwadratów liczb
		Set<Integer> biggerThan5 = squareNumbers.stream()
												.filter(NumberStream3::isDividedBy)
												.map(NumberStream3::divide)
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
