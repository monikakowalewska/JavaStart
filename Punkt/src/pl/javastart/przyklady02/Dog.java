package pl.javastart.przyklady02;

import pl.javastart.przyklady.Animal01;

public class Dog extends Animal01{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void giveSound() {
		System.out.println("Jestem psem i nazywam siê " + getName());
	}
	
	public void bark() {
		System.out.println("Hau hau!");
	}


}
