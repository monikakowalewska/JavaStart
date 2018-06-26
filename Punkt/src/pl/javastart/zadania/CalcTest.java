package pl.javastart.zadania;

import java.util.Random;

public class CalcTest {
	public static void main(String[] args) {
	
		Calculator01 calc=new Calculator01(); 
		
		System.out.println("6+3="+calc.add(6, 3)+"\n4567+63534+234="+calc.add(4567,6353,234)+"\n45,6+32,76+87,25="+calc.add(45.6,32.76,87.25));
		Random rand = new Random();
	       int number1 = rand.nextInt(200); // losowa liczba z przedzia³u [0, 199],
	       int number2 = new Random().nextInt(200); // krótsza wersja
	       int number3 = new Random().nextInt(200);
	       int x=number1;
	       int y=number2;
	       int z=number3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("ró¿nica pierwszej i drugiej liczby to "+calc.subtract(x, y));
		System.out.println("pierwsza liczba odj¹æ druga i trzecia to "+calc.subtract(x, y, z));
		double number4=new Random().nextDouble();
		double number5=new Random().nextDouble();
		double number6=new Random().nextDouble();
		double a=number4;
		double b=number5;
		double c=number6;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("ró¿nica pierwszej i drugiej liczby to"+calc.subtract(a, b));
		System.out.println("pierwsza liczba odj¹æ druga i trzecia to "+calc.subtract(a, b, c));
		
		
	}
}
