package pl.javastart.przyklady;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
	public static void main(String[] args) {
		/*	"stw�rz strumie� zaczynaj�c od 0, a ka�dy element powinien by� zgodny z przekazan� funkcj�,"
		+ " czyli kolejne warto�ci powinny by� wi�ksze od 1 od poprzedniej".*/
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
	
		//lista 100 pierwszych liczb podzielnych przez 2
		/*List<Integer> numbers = numStream.filter(x -> x%2 == 0).limit(100).collect(Collectors.toList());
		numbers.forEach(x -> System.out.print(x+" ; "));*/
		//lista kwadrat�w kolejnych 100 liczb ca�kowitych
		List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
		squareNumbers.forEach(x -> System.out.print(x+" ; ")); /*- dzia�a wtedy gdy jest jedyn� list�*/
		//lista 100 liczb ujemnych w kolejno�ci malej�cej
		/*List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());*/
		
	}
}
