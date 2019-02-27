package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		Random r = new Random();
		generate(ints, 50, () -> r.nextInt(1000));
		for(int n: ints) {
			System.out.println(n);
		}
	}
	
	private static <T> void generate(List<T> list, int num, Supplier<T> sup) {/*trzy argumenty - pust¹ listê, iloœæ liczb do wygenerowania oraz
		funkcjê, która nie przyjmuje ¿adnego argumentu i zwraca w
		wyniku liczbê wygenerowan¹ przez metodê nextInt() klasy Random z zakresu od 0 do 1000*/
		for(int i=0; i<num; i++) {
			list.add(sup.get());/*dodaj do listy element wygenerowany przez funkcjê sup".
*/		}
	}
}
