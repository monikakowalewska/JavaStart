package pl.javastart.przyklady;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIterator {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(45);
		numbers.add(3);
		numbers.add(21);
		numbers.add(150);
		numbers.add(1);
		
		Iterator<Integer> numIterator = numbers.iterator();//Obiekt typu Iterator zwracany jest przez metodê iterator() dowolnej kolekcji
		while(numIterator.hasNext()) {//Metoda hasNext() sprawdza, czy istnieje kolejny element kolekcji, ale do niego nie przechodzi
			int number = numIterator.next();//metoda next() przechodzi do kolejnego elementu i go zwraca.
			System.out.println(number);
		}
	}

}
