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

		// p�tla ok, bo nie korzystamy z iteratora
		System.out.println(">>> P�tla 1");
		for (int i = 0; i < names.size(); i++) {//iterujemy po elementach bezpo�rednio na kolekcji
			String name = names.get(i);
			System.out.println(name);
			if (name.equals("Basia")) {
				names.remove(name);
				i--;
			}
		}

		Iterator<String> namesIterator = names.iterator();//wykorzystujemy jednak jawnie lub niejawnie iteratory, 
		//zatem usuwanie element�w bezpo�rednio z kolekcji spowoduje b��d
		System.out.println(">>> P�tla 2");
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
			if (name.equals("Kasia")) {
				// b��d - iterujemy po kolekcji za pomoc� iteratora, a usuwamy
				// obiekt metod� remove() bezpo�rednio z kolekcji
				namesIterator.remove();
			}
		}
		
		System.out.println(">>> P�tla 3");
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Maniek")) {
				// b��d - iterujemy po kolekcji za pomoc� niejawnego iteratora
				// petli for-each, a usuwamy
				// obiekt metod� remove() bezpo�rednio z kolekcji
				names.remove(name);
			}
		}

	}

}
