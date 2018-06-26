package pl.javastart.zadania03;

import pl.javastart.zadania02.ExhaustPart;
import pl.javastart.zadania02.Tire;
import pl.javastart.zadania02.Wheel;

public class PartForCarApp {
	public static void main(String[] args) {
		Tire tire=new Tire(16,20,"Audi",2132,"Produx","mp180");
		tire.print();
		Wheel wh=new Wheel(18,30,"Mazda",2345,"Mix","ww180");
		wh.print();
		ExhaustPart ep=new ExhaustPart("Daewoo",456, "Midux","dp789","ep180");
		ep.print();
	}

}
