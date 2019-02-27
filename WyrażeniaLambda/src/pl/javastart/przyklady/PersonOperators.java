package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jan", "Kowalski", 42));
		persons.add(new Person("Kasia", "Kruczkowska", 22));
		persons.add(new Person("Piotr", "Adamiak", 15));
		persons.add(new Person("Krzysztof", "Wojtyniak", 16));
		persons.add(new Person("Agnieszka", "Zagumna", 18));
		persons.add(new Person("Basia", "Cyniczna", 28));

		consumeList(persons, p -> System.out.println(p));
		System.out.println(">>>");
		applyToList(persons, p -> {
			p.setAge(p.getAge() + 1);
			return p;
		});
		consumeList(persons, p -> System.out.println(p));
		System.out.println(">>>");
		filterByPredicate(persons, p -> p.getAge() > 18);
	}

	private static <T> void applyToList(List<T> list, Function<T, T> pre) {/*pierwszy jej argument przekazali�my nasz� list�, a jako drugi 
		przekazali�my funkcj� przyjmuj�c� argument typu Person i zwracaj�c� ten sam obiekt, ale z wiekiem zwi�kszonym o 1.*/
		for (int i = 0; i < list.size(); i++) {
			list.set(i, pre.apply(list.get(i)));/*podmie� element listy na pozycji i obiektem 
			zwr�conym przez funkcj� pre, kt�rej jako argument przekazujemy obiekt list.get(i)*/
		}
	}

	private static <T> void consumeList(List<T> list, Consumer<T> consumer) {/*Poniewa� nasza lista (pierwszy argument) przechowuje 
		obiekty typu Person, to funkcja r�wnie� musi operowa� na tych samych obiektach*/
		for (T t : list) {
			consumer.accept(t);/*wywo�aj funkcj� consumer przekazan� jako argument z obiektem t jako argumentem*/
		}
	}

	private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
		for (T t : list) {
			if (pre.test(t)) {/*"wykonaj blok if je�li funkcja pre przekazana jako argument wywo�ana z argumentem t zwraca true
*/				System.out.println(t);
			}
		}
	}
}
