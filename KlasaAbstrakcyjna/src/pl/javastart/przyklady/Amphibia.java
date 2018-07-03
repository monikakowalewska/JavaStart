package pl.javastart.przyklady;

public class Amphibia implements Car1, Boat {
	@Override
	public void printName() {
		System.out.print("Amfibia to trochê ");
		Car1.super.printName();//wywo³anie metody z interfejsu
		System.out.print(" a trochê ");
		Boat.super.printName();

	}

}
