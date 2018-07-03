package pl.javastart.przyklady;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle implements Shape{
	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Rectangle(){}
	public Rectangle(double a, double b) {
		setA(a);
		setB(b);
	}

	@Override
	public double calculateArea() {
		return a*b;
	}

	@Override
	public double calculatePerimeter() {
		return 2*a + 2*b;
	}
	public void pobierzDane(){
		Scanner odczyt=new Scanner(System.in);
		
		
		boolean error = true;
		while (error) {
		try{
		System.out.println("Wykonajmy dzia�ania na prostok�cie. Podaj liczb� (z przecinkiem z �rodku)");
		a=odczyt.nextDouble();
		setA(a);
		System.out.println("Podaj drug� liczb� (z przecinkiem  w �rodku)");
		b=odczyt.nextDouble();
		setB(b);
		
		error = false;
		}
		catch(InputMismatchException e){
			System.out.println("Podaj liczb� z przecinkiem z �rodku! Skup si�! Gdzie jest przecinek?");
			odczyt.nextLine();
		}
		}
		
		System.out.println("Pole prostok�ta to " +calculateArea());
		System.out.println("Obw�d prostok�ta to "+calculatePerimeter());
		odczyt.nextLine();
		/*odczyt.close();*/
	}
}
