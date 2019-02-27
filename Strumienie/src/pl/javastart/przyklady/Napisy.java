package pl.javastart.przyklady;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Napisy {
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		List<String> stringList = strings.peek(System.out::println) //przed zmian�

		.map(String::toUpperCase)// map i toUpperCase -zmieni� napisy, aby by�y zapisane kapitalikami
		.peek(System.out::println)//nie modyfikuje strumienia, tylko przechodzi przez ka�dy jego element i w wyniku zwraca ten sam strumie�:
		.collect(Collectors.toList());
	}
}
