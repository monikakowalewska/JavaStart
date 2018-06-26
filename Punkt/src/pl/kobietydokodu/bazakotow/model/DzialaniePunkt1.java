package pl.kobietydokodu.bazakotow.model;

public class DzialaniePunkt1 {
	public static void main(String args[]){
		Punkt1 punkt = new Punkt1();
		punkt.x = 5;
		punkt.y = 4;
		Punkt1.zwieksz(punkt);
		System.out.println("Zwiêkszenie argumentu x o 1 daje nam "+punkt.x);
		Punkt1.zmien(punkt);
		System.out.println("Zmiana argumentu y o 2 daje nam "+punkt.y);
		
		Punkt1.print(punkt) ;
		
		System.out.println("Getter punktu x zwraca "+punkt.getX());
		System.out.println("Getter punktu y zwraca "+punkt.getY());
	}

}
