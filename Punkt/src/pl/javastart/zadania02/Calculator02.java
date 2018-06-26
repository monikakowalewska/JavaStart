package pl.javastart.zadania02;

import java.util.Locale;
import java.util.Scanner;

import pl.javastart.zadania.Calculator;

public class Calculator02 {
	static Calculator calc=new Calculator();
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a;
	String znak;
	double b;
	sc.useLocale(Locale.US);
	
	System.out.println("Podaj pierwsz¹ liczbê z kropk¹ w œrodku");
	a=sc.nextDouble();
	
	sc.nextLine();
	System.out.println("Wpisz jeden ze znaków +,-,*,/ ");
	znak=sc.nextLine();
	
	System.out.println("Podaj drug¹ liczbê z kropk¹ w œrodku");
	b=sc.nextDouble();

	sc.close();
	
	switch(znak){
	case "+":
		System.out.println("a+b="+calc.add(a,b));
		break;
	case"-":
		System.out.println("a-b="+calc.subtract(a, b));
		break;
	case"*":
		System.out.println("a*b="+calc.multiply(a, b));
		break;
	case "/":
		System.out.println("a/b="+calc.divide(a, b));
		break;
		default:
			System.out.println("System siê wypier*oli³");
			break;
	}
}
}
