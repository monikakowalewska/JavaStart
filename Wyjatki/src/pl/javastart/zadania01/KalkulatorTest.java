package pl.javastart.zadania01;



import pl.javastart.zadania02.UnkownOperatorException;

public class KalkulatorTest {
	public static void main(String[] args) {
	Kalkulator kalk=new Kalkulator();
	kalk.pobierzLiczbe1();
	kalk.pobierzLiczbe2();
	try{
	kalk.pobierzOperator();
	}
	catch(UnkownOperatorException e) {
		System.err.println("Nie mo¿na znalezc takiego operatora");
		System.err.println(e.getMessage());
	}
	catch(ArithmeticException e){
		System.err.println("Nie dziel przez 0 cholero");
		System.err.println(e.getMessage());
	};
}
}
