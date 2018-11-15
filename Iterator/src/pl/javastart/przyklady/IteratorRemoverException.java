package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoverException {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Kasia");
		names.add("Basia");
		names.add("Kajtek");
		names.add("Wojtek");
		names.add("Maniek");

		// pêtla ok, bo nie korzystamy z iteratora
		System.out.println(">>> Pêtla 1");
		for (int i = 0; i < names.size(); i++) {//iterujemy po elementach bezpoœrednio na kolekcji
			String name = names.get(i);
			System.out.println(name);
			if (name.equals("Basia")) {
				names.remove(name);
				i--;
			}
		}

		Iterator<String> namesIterator = names.iterator();//wykorzystujemy jednak jawnie lub niejawnie iteratory, 
		//zatem usuwanie elementów bezpoœrednio z kolekcji spowoduje b³¹d
		System.out.println(">>> Pêtla 2");
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
			if (name.equals("Kasia")) {
				// b³¹d - iterujemy po kolekcji za pomoc¹ iteratora, a usuwamy
				// obiekt metod¹ remove() bezpoœrednio z kolekcji
				namesIterator.remove();
			}
		}
		
		System.out.println(">>> Pêtla 3");
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Maniek")) {
				// b³¹d - iterujemy po kolekcji za pomoc¹ niejawnego iteratora
				// petli for-each, a usuwamy
				// obiekt metod¹ remove() bezpoœrednio z kolekcji
				names.remove(name);
			}
		}

	}

}
