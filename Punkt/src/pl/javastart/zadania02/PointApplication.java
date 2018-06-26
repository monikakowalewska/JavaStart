package pl.javastart.zadania02;

import java.util.Scanner;

import pl.javastart.zadania.Point;

public class PointApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		

Point punkt=new Point(15,66);


System.out.println("Wsp�rz�dne punktu to "+punkt.getX()+" i "+punkt.getY());
//przeniesienie kiedy parametrem jest element obiektu
PointController relokacja=new PointController();
System.out.println("Punkt przeniesiony w prawo ma wsp�rz�dne "+relokacja.addX(punkt.getX())+" i "+relokacja.addY(punkt.getY()));
System.out.println("Punkt przeniesiony w lewo ma wsp�rz�dne "+relokacja.minusX(punkt.getX())+" i "+relokacja.minusY(punkt.getY()));

//przeniesienie kiedy parametrem metody jest obiekt
//b��d bo nie mo�na dodawa� + do metody void
/*System.out.println("Punkt przeniesiony w prawo ma wsp�rz�dne "+relokacja.addX(punkt)+" i "+relokacja.addY(punkt));
System.out.println("Punkt przeniesiony w lewo ma wsp�rz�dne "+relokacja.minusX(punkt)+" i "+relokacja.minusY(punkt));*/
System.out.println("Punkt: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.addX(punkt);
System.out.println("Punkt addX: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.addY(punkt);
System.out.println("Punkt addY: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.minusX(punkt);
System.out.println("Punkt minusX: (" + punkt.getX()+";"+punkt.getY()+")");
relokacja.minusY(punkt);
System.out.println("Punkt minusY: (" + punkt.getX()+";"+punkt.getY()+")");


System.out.println("Jesli chcesz doda� do x 1 - wci�nij 1");
System.out.println("Jesli chcesz odj�� od x 1 - wci�nij 2");
System.out.println("Jesli chcesz doda� do y 1 - wci�nij 3");
System.out.println("Jesli chcesz odj�� od y 1 - wci�nij 4");
Scanner sc=new Scanner(System.in);
int i = sc.nextInt();
switch(i){
case 1:
	relokacja.addX(punkt);
	System.out.println("Zmienione wsp�rz�dne (dodane 1 do x) to "+ punkt.getX()+";"+punkt.getY());	
	break;
case 2:
	relokacja.minusX(punkt);
	System.out.println("Zmienione wsp�rz�dne (odj�te 1 od x) to "+ punkt.getX()+";"+punkt.getY());
	break;
case 3:
	relokacja.addY(punkt);
	System.out.println("Zmienione wsp�rz�dne (dodane 1 do y) to "+ punkt.getX()+";"+punkt.getY());
	break;
case 4:
	relokacja.minusY(punkt);
	System.out.println("Zmienione wsp�rz�dne (odj�te 1 do y) to "+ punkt.getX()+";"+punkt.getY());
	break;
	default:
		System.out.println("Wpisa�e� nieprawid�ow� liczb�");
		}
System.out.println("Zmienione wsp�rz�dne to "+ punkt.getX()+";"+punkt.getY());



Point p1 = new Point(10, 20);

PointController pc = new PointController();

pc.changeObject(p1);

System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");


}
}