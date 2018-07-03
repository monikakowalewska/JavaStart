package pl.javastart.zadania00;

import java.util.InputMismatchException;
import java.util.Scanner;

import pl.javastart.przyklady.Shape;

public class Triangle implements Shape {

	private double a;
	private double b;
	private double c;
	private double h;
	
	
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

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	public Triangle(){}
	public Triangle(double a, double b, double c){
		setA(a);
		setB(b);
		setC(c);
	}
	public Triangle(double a, double h){
		setA(a);
		setH(h);
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*a*h;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	public void pobierzDane(){
		Scanner odczyt=new Scanner(System.in);
		
		
		boolean error = true;
		while (error) {
		try{
		System.out.println("Wykonajmy dzia�ania na tr�jk�cie. Podaj liczb� (z przecinkiem z �rodku) jako pierwszy bok (podstawa)");
		a=odczyt.nextDouble();
		setA(a);
		System.out.println("Podaj drug� liczb� (z przecinkiem  w �rodku) jako drugi bok");
		b=odczyt.nextDouble();
		setB(b);
		System.out.println("Podaj trzeci� liczb� (z przecinkiem  w �rodku) jako trzeci bok");
		c=odczyt.nextDouble();
		setC(c);
		System.out.println("Podaj czwart� liczb� (z przecinkiem  w �rodku) jako wysoko��");
		h=odczyt.nextDouble();
		setH(h);
		error = false;
		}
		catch(InputMismatchException e){
			System.out.println("Podaj liczb� z przecinkiem z �rodku! Skup si�! Gdzie jest przecinek?");
			odczyt.nextLine();
		}
		}
		
		System.out.println("Pole tr�jk�ta to " +calculateArea());
		System.out.println("Obw�d tr�jk�ta to "+calculatePerimeter());
		odczyt.nextLine();
		/*odczyt.close();*/
	}
	

}
