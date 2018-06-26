package pl.javastart.wyjatki;

public class Wyjatek03 {
private int[] numbers;
	
	public Wyjatek03() {
		numbers = new int[10];
	}
	
	public void add(int index, int number) throws ArrayIndexOutOfBoundsException {//instrukcja throw
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Indeks musi byæ wiêkszy od 0!");
		} else if (index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException(
					"Indeks musi byæ mniejszy od rozmiaru tablicy: " + numbers.length);
		}
		numbers[index] = number;
	}

	
	public int get(int index) throws ArrayIndexOutOfBoundsException {
		if(index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return numbers[index];
	}

}
