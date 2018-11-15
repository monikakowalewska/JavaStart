package pl.javastart.zadania00;

import java.util.InputMismatchException;
import java.util.Scanner;

import pl.javastart.przyklady.Shape;
import java.lang.Math;

public class Triangle implements Shape {

	private double a;
	private double b;
	private double c;
	
	
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

	public Triangle(){}
	public Triangle(double a, double b, double c){
		setA(a);
		setB(b);
		setC(c);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
				return Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
	public boolean czyTrojkat() {
		double p = 0.5 * (a + b + c);

		if ((p * (p - a) * (p - b) * (p - c)) <= 0) {
			System.out.println("To nie jest tr�jkat");
			return false;
		} else {
			return true;
		}

	}
	public void pobierzDane(){
		Scanner odczyt=new Scanner(System.in);
		
		
		boolean error = true;
		while (error) {
		try{
		do {
		System.out.println("Wykonajmy dzia�ania na tr�jk�cie. Podaj liczb� (z przecinkiem z �rodku) jako pierwszy bok (podstawa)");
		a=odczyt.nextDouble();
		setA(a);
		System.out.println("Podaj drug� liczb� (z przecinkiem  w �rodku) jako drugi bok");
		b=odczyt.nextDouble();
		setB(b);
		System.out.println("Podaj trzeci� liczb� (z przecinkiem  w �rodku) jako trzeci bok");
		c=odczyt.nextDouble();
		setC(c);
		}while(!czyTrojkat());


		error = false;
		if(a<=0||b<=0||c<=0){
			throw new ArithmeticException("Boki i wysoko�� tr�jk�ta powinny by� d�u�sze od 0");
		}
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
