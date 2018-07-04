package pl.javastart.przyklady;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle implements Shape {

	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	public Circle(){
		
	}
	public Circle(double r) {
		setR(r);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Shape.PI * r*r;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2* Shape.PI * r;
	}
public void pobierzDane()throws ArithmeticException{
	Scanner odczyt=new Scanner(System.in);
	System.out.println("Wykonajmy dzia³ania na kole. Podaj d³ugoœæ promienia (z przecinkiem z œrodku)");
	boolean error = true;
	while (error) {
	try{
	r=odczyt.nextDouble();
	setR(r);
	
	error = false;
	if(r<=0){
		throw new ArithmeticException("D³ugoœæ promienia musi byæ wiêksza od 0");
	}
	}
	catch(InputMismatchException e){
		System.out.println("Podaj liczbê z przecinkiem z œrodku! Skup siê! Gdzie jest przecinek?");
		odczyt.nextLine();
	}
	}
	System.out.println("Pole ko³a to " +calculateArea());
	System.out.println("Obwód ko³a to "+calculatePerimeter());
	odczyt.nextLine();
	/*odczyt.close();*/
}
}

