package pl.javastart.zadania;

public class Pair<T, V> {
	private T fruit;
	private V value;

	public T getT() {
		return fruit;
	}

	public V getV() {
		return value;
	}

	public void setT(T fruit) {
		this.fruit = fruit;
	}

	public void setV(V value) {
		this.value = value;
	}

	public Pair(T fruit, V value) {
		this.fruit = fruit;
		this.value = value;
	}

	public void printObjectT() {
		System.out.println(fruit);

	}

	public void printObjectV() {
		System.out.println(value);

	}
}
