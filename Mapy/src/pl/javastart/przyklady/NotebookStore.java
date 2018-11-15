package pl.javastart.przyklady;

import java.util.HashMap;
import java.util.Map;

public class NotebookStore {
	public static void main(String[] args) {
		Map<String, Notebook> notebooks = new HashMap<>();
		notebooks.put("B590", new Notebook("Lenovo", "B590"));
		notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
		notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
		notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));
		
		//wy�wietlamy zbi�r kluczy
		System.out.println("Modele laptop�w: ");
		for(String key: notebooks.keySet()) {
			System.out.println(key);
		}
		
		//wy�wietlamy informacj� o laptopach na podstawie kluczy
		String key = "G2A33EA";
		System.out.println("Znaleziono laptop o kodzie G2A33EA: ");
		System.out.println(notebooks.get(key));
		
		//usuwamy obiekt na podstawie klucza
		notebooks.remove("XPS0091V");
		
		System.out.println("Ilo�� produkt�w w sklepie: " + notebooks.size());
	}

}
