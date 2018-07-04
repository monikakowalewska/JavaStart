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
	System.out.println("Wykonajmy dzia�ania na kole. Podaj d�ugo�� promienia (z przecinkiem z �rodku)");
	boolean error = true;
	while (error) {
	try{
	r=odczyt.nextDouble();
	setR(r);
	
	error = false;
	if(r<=0){
		throw new ArithmeticException("D�ugo�� promienia musi by� wi�ksza od 0");
	}
	}
	catch(InputMismatchException e){
		System.out.println("Podaj liczb� z przecinkiem z �rodku! Skup si�! Gdzie jest przecinek?");
		odczyt.nextLine();
	}
	}
	System.out.println("Pole ko�a to " +calculateArea());
	System.out.println("Obw�d ko�a to "+calculatePerimeter());
	odczyt.nextLine();
	/*odczyt.close();*/
}
}

