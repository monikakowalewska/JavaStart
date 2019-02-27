package pl.javastart.przyklady;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
	public static void main(String[] args) {
		/*	"stwórz strumieñ zaczynaj¹c od 0, a ka¿dy element powinien byæ zgodny z przekazan¹ funkcj¹,"
		+ " czyli kolejne wartoœci powinny byæ wiêksze od 1 od poprzedniej".*/
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
	
		//lista 100 pierwszych liczb podzielnych przez 2
		/*List<Integer> numbers = numStream.filter(x -> x%2 == 0).limit(100).collect(Collectors.toList());
		numbers.forEach(x -> System.out.print(x+" ; "));*/
		//lista kwadratów kolejnych 100 liczb ca³kowitych
		List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
		squareNumbers.forEach(x -> System.out.print(x+" ; ")); /*- dzia³a wtedy gdy jest jedyn¹ list¹*/
		//lista 100 liczb ujemnych w kolejnoœci malej¹cej
		/*List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());*/
		
	}
}
