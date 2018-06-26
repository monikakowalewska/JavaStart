package pl.javastart.zadania02;

import java.util.Scanner;

import pl.javastart.zadania.Point;

public class PointApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		

Point punkt=new Point(15,66);


System.out.println("Wspó³rzêdne punktu to "+punkt.getX()+" i "+punkt.getY());
//przeniesienie kiedy parametrem jest element obiektu
PointController relokacja=new PointController();
System.out.println("Punkt przeniesiony w prawo ma wspó³rzêdne "+relokacja.addX(punkt.getX())+" i "+relokacja.addY(punkt.getY()));
System.out.println("Punkt przeniesiony w lewo ma wspó³rzêdne "+relokacja.minusX(punkt.getX())+" i "+relokacja.minusY(punkt.getY()));

//przeniesienie kiedy parametrem metody jest obiekt
//b³¹d bo nie mo¿na dodawaæ + do metody void
/*System.out.println("Punkt przeniesiony w prawo ma wspó³rzêdne "+relokacja.addX(punkt)+" i "+relokacja.addY(punkt));
System.out.println("Punkt przeniesiony w lewo ma wspó³rzêdne "+relokacja.minusX(punkt)+" i "+relokacja.minusY(punkt));*/
System.out.println("Punkt: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.addX(punkt);
System.out.println("Punkt addX: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.addY(punkt);
System.out.println("Punkt addY: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.minusX(punkt);
System.out.println("Punkt minusX: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.minusY(punkt);
System.out.println("Punkt minusY: (" + punkt.getX()+";"+punkt.getY()+")");


System.out.println("Jesli chcesz dodaæ do x 1 - wciœnij 1");
System.out.println("Jesli chcesz odj¹æ od x 1 - wciœnij 2");
System.out.println("Jesli chcesz dodaæ do y 1 - wciœnij 3");
System.out.println("Jesli chcesz odj¹æ od y 1 - wciœnij 4");
Scanner sc=new Scanner(System.in);
int i = sc.nextInt();
switch(i){
case 1:
	relokacja.addX(punkt);
	System.out.println("Zmienione wspó³rzêdne (dodane 1 do x) to "+ punkt.getX()+";"+punkt.getY());	
	break;
case 2:
	relokacja.minusX(punkt);
	System.out.println("Zmienione wspó³rzêdne (odjête 1 od x) to "+ punkt.getX()+";"+punkt.getY());
	break;
case 3:
	relokacja.addY(punkt);
	System.out.println("Zmienione wspó³rzêdne (dodane 1 do y) to "+ punkt.getX()+";"+punkt.getY());
	break;
case 4:
	relokacja.minusY(punkt);
	System.out.println("Zmienione wspó³rzêdne (odjête 1 do y) to "+ punkt.getX()+";"+punkt.getY());
	break;
	default:
		System.out.println("Wpisa³eœ nieprawid³ow¹ liczbê");
		}
System.out.println("Zmienione wspó³rzêdne to "+ punkt.getX()+";"+punkt.getY());



Point p1 = new Point(10, 20);

PointController pc = new PointController();

pc.changeObject(p1);

System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");


}
}