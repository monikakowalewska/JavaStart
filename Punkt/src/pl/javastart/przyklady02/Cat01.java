package pl.javastart.przyklady02;

import pl.javastart.przyklady.Animal01;

public class Cat01 extends Animal01{
	public Cat01(String name) {
		super(name);
	}
	
	@Override
	public void giveSound() {
		System.out.println("Jestem kotem i nazywam siê " + getName());
	}

	public void meow() {
		System.out.println("Miaaaaau");
	}

}
