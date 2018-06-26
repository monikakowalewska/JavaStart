package dziedziczenie;

public abstract class Emeryt {
	public static final int ILOSC_OCZU = 2; //sta³e s¹ ok
	 
    //metoda abstrakcyjna - nie implementuj
    public abstract String krzyczNaDzieci();
 
    //zwyk³a metoda z implementacj¹
    public static void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kie³base bede za "+czas+" minut.");
    }
}
