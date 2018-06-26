package pl.javastart.przyklady;

public class ComputerStore {
	public static void main(String[] args) {
		Computer comp1 = new Computer("Intel i5", 8192);
        Computer comp2 = new Computer("AMD Ryzen 1700", 16384);
        /*ComputerFactory factory = new ComputerFactory();*/
        /*Computer comp1 = factory.create("Intel i5", 8192);
        Computer comp2 = factory.create("AMD Ryzen 1700", 16384);*/
 
        // klient chce dodaæ jeszcze 4GB ramu
        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 4096);
 
        comp1.printInfo();
        comp2.printInfo();
    }
}
