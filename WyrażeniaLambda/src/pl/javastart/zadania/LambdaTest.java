package pl.javastart.zadania;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		Random r = new Random();
		generate(ints, 10, () -> r.nextInt(1000));
		System.out.println("10 liczb:");
		numberList(ints, p -> System.out.println(p));
		/*Iterator<Integer> intsIterator = ints.iterator();
		while (intsIterator.hasNext()) {
			Integer number = intsIterator.next();
			if (number%2==0) {
				intsIterator.remove();
			}
		}*/
		System.out.println("filter by predicate. Usuniêcie z listy liczb podzielnych przez 2:");
		filterByPredicate(ints, p -> p %2 ==0 );//jeœli element jest podzielny przez 2 zwracane jest true, w innej sytuacji false.;predykat
		numberList(ints, p -> System.out.println(p));

	}

	private static <T> void generate(List<T> list, int num,Supplier<T> sup) {
		/* trzy argumenty - pust¹ listê, iloœæ liczb do wygenerowania oraz funkcjê, która nie
								 * przyjmuje ¿adnego argumentu i zwraca w wyniku liczbê wygenerowan¹ przez metodê nextInt()
								 * klasy Random z zakresu od 0 do 1000
								 */
		for (int i = 0; i < num; i++) {
			list.add(sup.get());//dodaj do listy element wygenerowany przez funkcjê sup
			}
	}

	private static <T> void numberList(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);// wywo³aj funkcjê consumer przekazan¹ jako argument z obiektem t jako argumentem
		}
	}
	private static <T> void filterByPredicate(List<T> list, Predicate<T> pred) {
		Iterator<T> it = list.iterator();
		while(it.hasNext()) {
			T tmp = it.next();
			if(pred.test(tmp)) { //je¿eli dla któregoœ z elementów przekazana funkcja zwróci wartoœæ true, to element taki jest usuwany. 
				it.remove();
			}
		}
	}
}