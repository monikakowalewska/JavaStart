package pl.javastart.zadania00;

import pl.javastart.przyklady.Circle;
import pl.javastart.przyklady.Rectangle;

public class LogicApp {
	public static void main(String[] args){
		boolean error = true;
		while (error) {
		try
		{Circle c=new Circle();
		c.pobierzDane();
		Rectangle r=new Rectangle();
		r.pobierzDane();
		Triangle t=new Triangle();
		t.pobierzDane();
		t.czyTrojkat();
		error=false;
		}
		catch (ArithmeticException e){
			System.out.println("Sk�adowe figur p�askich musz� by� wi�ksze od 0");
		}
	}
}
}