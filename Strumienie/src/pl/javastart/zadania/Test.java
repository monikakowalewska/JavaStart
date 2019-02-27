package pl.javastart.zadania;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
		List<Integer> numbers = numStream.filter(x -> x%5 == 0&&x>100&&x<1000)
				.limit(10)
				.map(x -> x*3)
				.collect(Collectors.toList());
		numbers.forEach(System.out::println);
	}
}
