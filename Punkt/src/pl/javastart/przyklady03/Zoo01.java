package pl.javastart.przyklady03;

import pl.javastart.przyklady.Animal01;
import pl.javastart.przyklady02.Cat01;
import pl.javastart.przyklady02.Dog;

public class Zoo01 {
	public static void main(String[] args) {
		Animal01 dog = new Dog("Burek");
		Animal01 cat = new Cat01("Mruczek");
		Animal01 doge = new Animal01("Kotopies");
		
		dog.giveSound();
		cat.giveSound();
		doge.giveSound();
		
		//mo¿na klasê zmieniæ w ten sposób
		Animal01[] animals = new Animal01[3];
		animals[0] = new Dog("Burek");
		animals[1] = new Cat01("Mruczek");
		animals[2] = new Animal01("Kotopies");
		
		for(Animal01 animal: animals) {
			animal.giveSound();
		}
		
changeAnimalName(animals[0], "Piese³");//wywo³anie metody statycznej 
		
		for(Animal01 animal: animals) {
			animal.giveSound();
		}
		

		//rzutowanie do zmiennej
				Dog specificDog = (Dog)dog;
				specificDog.bark();//nie mo¿na zrobiæ dog.bark();
				
				//rzutowanie "w locie"
				((Cat01)cat).meow();
	}
	
	private static void changeAnimalName(Animal01 animal, String newName) {
		animal.setName(newName);
	}



	}


