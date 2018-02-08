package pl.kobietydokodu.bazakotow.model;

public class Konwersje 
{
	public static void main(String[] args)
	{
	int a=32;
	double b=4.2;
	double c= a+b;
	int d= (int) ((int)a+b);
	char l= (char) (a+b);
	System.out.println("Suma char "+l);
	System.out.println("Suma double "+c);
	System.out.println("Suma int "+d);
	float e=(float) ((float)a/b);
	System.out.println("Dzielenie float "+e);
	byte g= (byte) ((byte) a*b);
	System.out.println("Mno¿enie byte "+g);
	double h= Math.pow(a,b);
	System.out.println("potega a do b w double "+h);
	float n= (float) Math.pow(a,b);
	System.out.println("potega a do b w float "+n);
	short i=(short) Math.abs(b);
	System.out.println("Wartosc bezwzgledna b w short "+i);
	long j=(long) Math.sqrt(b);
	System.out.println("Pierwiastek z b w long "+j);
	char k=(char) Math.pow(b, b);
	System.out.println("Potega b do b w char "+k);
	
	
	
}

	private static short pow(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
}