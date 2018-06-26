package dziedziczenie;

public class Dzia³anieVarargs extends Varargs{
	public static void main (String args[]){
		System.out.print(suma(3) + " ");
		System.out.print(suma(3,3) + " ");
		System.out.print(suma(3,3,3) + " ");
		System.out.println(suma(3,3,3,3,3,3) + " ");
		wypisz(3,5,7,9,11);
}
}