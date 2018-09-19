package pl.javastart.przyklady;

public class Container <T>{
	private T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public T get(int index) {//get, która zwraca element z tablicy o indeksie index.
		return array[index];
	}

	public void printObjects() {
		for(T o: array) {
			System.out.println(o);
		}
	}

}
