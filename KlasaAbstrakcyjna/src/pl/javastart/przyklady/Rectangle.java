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
		System.out.println("Wykonajmy dzia³ania na prostok¹cie. Podaj liczbê (z przecinkiem z œrodku)");
		a=odczyt.nextDouble();
		setA(a);
		System.out.println("Podaj drug¹ liczbê (z przecinkiem  w œrodku)");
		b=odczyt.nextDouble();
		setB(b);
		
		error = false;
		}
		catch(InputMismatchException e){
			System.out.println("Podaj liczbê z przecinkiem z œrodku! Skup siê! Gdzie jest przecinek?");
			odczyt.nextLine();
		}
		}
		
		System.out.println("Pole prostok¹ta to " +calculateArea());
		System.out.println("Obwód prostok¹ta to "+calculatePerimeter());
		odczyt.nextLine();
		/*odczyt.close();*/
	}
}
