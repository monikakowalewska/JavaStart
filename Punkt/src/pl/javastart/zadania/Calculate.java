package pl.javastart.zadania;

public class Calculate {
	public static void main(String[] args) {
	double a=353.7;
	double b=9.138;
	Calculator calc=new Calculator();
	calc.add(a, b);
	calc.subtract(a, b);
	calc.multiply(a, b);
	calc.divide(a, b);
	System.out.println("a+b="+calc.add(a,b)+"\n a-b="+calc.subtract(a, b)+"\n a*b="+calc.multiply(a, b)+"\n a/b="+calc.divide(a, b));
	
		
	}
}
