package ciekaweKlasy;

public class Car {
	private Engine engine;
	private int fuel;
	
	public Car() {
		engine = new Engine("Ferrari");
		System.out.println("Utworzono samoch�d z silnikiem " + engine.engineType);
	}
	
	public void go() throws InterruptedException {
		while(fuel > 0) {
			engine.consumeFuel();
			System.out.println("Pozosta�o " + fuel + " litr�w paliwa");
			Thread.sleep(1000);
		}
		System.out.println("Brak paliwa");
	}
	
	public void refuel(int liters) {
		fuel = fuel + liters;
	}
	
	public class Engine {
		
		private String engineType;
		private static final int FUEL_CONSUMPTION= 20;
		
		public Engine(String type) {
			engineType = type;
		}
		
		public void consumeFuel() {
			fuel = fuel - FUEL_CONSUMPTION;
		}
	}

}
