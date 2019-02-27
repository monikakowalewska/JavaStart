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
		System.out.println("filter by predicate. Usuni�cie z listy liczb podzielnych przez 2:");
		filterByPredicate(ints, p -> p %2 ==0 );//je�li element jest podzielny przez 2 zwracane jest true, w innej sytuacji false.;predykat
		numberList(ints, p -> System.out.println(p));

	}

	private static <T> void generate(List<T> list, int num,Supplier<T> sup) {
		/* trzy argumenty - pust� list�, ilo�� liczb do wygenerowania oraz funkcj�, kt�ra nie
								 * przyjmuje �adnego argumentu i zwraca w wyniku liczb� wygenerowan� przez metod� nextInt()
								 * klasy Random z zakresu od 0 do 1000
								 */
		for (int i = 0; i < num; i++) {
			list.add(sup.get());//dodaj do listy element wygenerowany przez funkcj� sup
			}
	}

	private static <T> void numberList(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);// wywo�aj funkcj� consumer przekazan� jako argument z obiektem t jako argumentem
		}
	}
	private static <T> void filterByPredicate(List<T> list, Predicate<T> pred) {
		Iterator<T> it = list.iterator();
		while(it.hasNext()) {
			T tmp = it.next();
			if(pred.test(tmp)) { //je�eli dla kt�rego� z element�w przekazana funkcja zwr�ci warto�� true, to element taki jest usuwany. 
				it.remove();
			}
		}
	}
}