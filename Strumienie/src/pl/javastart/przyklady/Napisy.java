package pl.javastart.przyklady;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Napisy {
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		List<String> stringList = strings.peek(System.out::println) //przed zmian¹

		.map(String::toUpperCase)// map i toUpperCase -zmieniæ napisy, aby by³y zapisane kapitalikami
		.peek(System.out::println)//nie modyfikuje strumienia, tylko przechodzi przez ka¿dy jego element i w wyniku zwraca ten sam strumieñ:
		.collect(Collectors.toList());
	}
}
