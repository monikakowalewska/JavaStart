package dziedziczenie;

public abstract class Emeryt {
	public static final int ILOSC_OCZU = 2; //sta�e s� ok
	 
    //metoda abstrakcyjna - nie implementuj
    public abstract String krzyczNaDzieci();
 
    //zwyk�a metoda z implementacj�
    public static void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kie�base bede za "+czas+" minut.");
    }
}
