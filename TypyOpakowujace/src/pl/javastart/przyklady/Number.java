package pl.javastart.przyklady;

public class Number {
	public static void main(String[] args) {
		
	}
	int num = 5;
	Integer number1 = new Integer(num);//konstruktor
	//alternatywnie
	Integer number2 = Integer.valueOf(num);//tworzymy obiekt za pomoc¹ metody valueOf()
	String number = Integer.toString(num);//konwersja liczb na napisy
	/*konwersja z typu String na inny typ obiektowy*/
	String number3 = "5.5";
	double num3 = Double.parseDouble(number3);
	Integer number4 = 5;//autoboxing, opakowanie z typu prostego na obiektowy
	int otherNumber = number4;//unboxing, rozpakowanie z typu obiektowego na prosty
}
