package pl.javastart.zadania;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratorMap {
	public static void main(String[] args) {
		Map<String, String> persons = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String t1[],t2[];
				t1=o1.split(" ");
				t2=o2.split(" ");
				System.out.println("t1[1] = " + t1[1]);
				System.out.println("t2[1] = "+ t2[1]);
				
				return t1[1].compareTo(t2[1]);
			}
		});
		
		String tekst = "Ala:ma:kota:a:kot:ma:Ale";
		String wynik1[] = null;
		
		// Do tablicy wynik1 trafi zawartoœæ zmiennej tekst 
		// podzielona na elementy: Ala, ma, kota itd.
		wynik1 = tekst.split(":");
		for(String x : wynik1)
			System.out.println(x);
		System.out.println(wynik1[1]);
		
	
	
		persons.put("Jan Kowalski","Jan Kowalski-44");
		persons.put("Weronika Mika","Weronika Mika-34");
		persons.put("Joachim Jachimek","Joachim Jachimek-43");
		persons.put("Adam Riesler","Adam Riesler-33");
		persons.put("Zuzanna Matla","Zuzanna Matla-49");
		System.out.println("Iloœæ osób: " + persons.size());
		
		Iterator<String> personsIterator =  persons.values().iterator();//zwraca w kolejnoœci alfabetycznej
		System.out.println(">>> Pêtla ");
		while (personsIterator.hasNext()) {
			String name = personsIterator.next();
			System.out.println(name);
		}
		Set<String> keySet = persons.keySet();//zwraca w kolejnoœci alfabetycznej
		System.out.println("Klucze:\n" + keySet);
		
		
		Collection<String> values = persons.values();
		System.out.println("Wartoœci:\n" + values);
	}

	

	
}
