package pl.javastart.zadania;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Reference {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Kasia", "Adela", "Wiola", "Basia", "Kunegunda");
	consumeArray(names, System.out::println);
	System.out.println(">>>");
	Collections.sort(names, String::compareToIgnoreCase);
	consumeArray(names, System.out::println);
}
private static <T> void consumeArray(List<T> arr, Consumer<T> consumer) {
	for (T t : arr) {
		consumer.accept(t);
	}
}
private static int compareToIgnoreCase(String t1, String t2) {
	return t1.compareTo(t2);
}
}
