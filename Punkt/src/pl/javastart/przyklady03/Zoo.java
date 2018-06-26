package pl.javastart.przyklady03;

import pl.javastart.przyklady02.Bird;
import pl.javastart.przyklady02.Cat;

public class Zoo {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.color = "Czarny";
		Bird bird = new Bird();
		bird.color = "Niebieski";
		System.out.println("Zwierzêta daj¹ g³os: ");
		System.out.print("Kot: ");
		cat.makeSound();

		System.out.print("Ptak: ");
		bird.makeSound();
	}

}
