package pl.javastart.zadania01;



import pl.javastart.zadania02.UnkownOperatorException;

public class KalkulatorTest {
public static void main(String[] args) throws UnkownOperatorException {
	
	
	Kalkulator kalk=new Kalkulator();
	kalk.pobierzLiczbe1();
	kalk.pobierzLiczbe2();
	kalk.pobierzOperator();
}
}
