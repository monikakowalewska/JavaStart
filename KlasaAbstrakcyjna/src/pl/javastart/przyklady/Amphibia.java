package pl.javastart.przyklady;

public class Amphibia implements Car1, Boat {
	@Override
	public void printName() {
		System.out.print("Amfibia to troch� ");
		Car1.super.printName();//wywo�anie metody z interfejsu
		System.out.print(" a troch� ");
		Boat.super.printName();

	}

}
