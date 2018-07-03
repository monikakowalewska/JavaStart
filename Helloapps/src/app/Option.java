package app;

import java.util.NoSuchElementException;

public enum Option {
	EXIT(0, "Wyj�cie z programu"),
	ADD_BOOK(1, "Dodanie ksi��ki"),
	ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
	PRINT_BOOKS(3, "Wy�wietlenie dost�pnych ksi��ek"),
	PRINT_MAGAZINES(4, "WY�wietlenie dost�pnych magazyn�w/gazet");

	private int value;
	private String description;

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	Option(int value, String desc) {
		this.value = value;
		this.description = desc;
	}
	
	@Override
	public String toString() {
		return value + " - " + description;
	}

	/*Metoda createFromInt() pozwala przekszta�ci� warto�� typu int na odpowiedni� warto�� typu Option. 
	 * Wykorzystujemy tutaj metod� values(), kt�ra zwraca tablic� wszystkich warto�ci, 
	 * a poniewa� kolejne elementy numerujemy od 0, to zwracamy po prostu odpowiedni element tej tablicy.*/
	public static Option createFromInt(int option) throws NoSuchElementException {
		Option result = null;
		try {
			result = Option.values()[option];
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException("Brak elementu o wskazanym ID");
		}
		
		return result;
	}


}
