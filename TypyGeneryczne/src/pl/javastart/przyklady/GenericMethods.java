package pl.javastart.przyklady;

import pl.javastart.zadania.Pair;

public class GenericMethods {
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.print5Times(2);//dochodzi do autoboxingu i zamiany na typ obiektowy
		gm.print5Times("Krzysio");
	}
	
	public <T> void print5Times(T arg) {// przyjmuje argument dowolnego typu obiektowego, w nawiasach ostrych metoda parametryzowana
		for(int i=0; i<5; i++)
			System.out.println(arg);
	}

	public <T,V>void print(Pair<String, String>arg) {
		// TODO Auto-generated method stub
		System.out.println(arg);
	}

}
