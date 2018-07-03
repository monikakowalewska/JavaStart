package pl.javastart.przyklady;

public interface Boat {
	default public void printName() {
		System.out.print("Boat");
	}

}
