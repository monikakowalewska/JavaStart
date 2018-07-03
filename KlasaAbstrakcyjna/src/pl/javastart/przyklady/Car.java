package pl.javastart.przyklady;

public class Car extends Vehicle{
	@Override
	public void speedUp() {
		setSpeed(getSpeed() + 5);
	}

}
