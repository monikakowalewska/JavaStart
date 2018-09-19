package pl.javastart.przyklady;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
	public static void main(String[] args) {
		double a = 0.7;
		double b = 0.3;
		System.out.println(a - b);
		// utworzenie obiektu na podstawie wartoœci typu String
		BigInteger big1 = new BigInteger("109876543210987654321");
		// utworzenie obiektu za pomoc¹ statycznej metody valueOf(), na
		// podstawie wartoœci typu prostego
		BigDecimal big2 = BigDecimal.valueOf(0.7);
		//obliczenia na typach prostych i z wykorzystaniem BigDecimal
		double c = 0.7;
		double d = 0.3;
		System.out.println("a - b = " +  (c-d));
		
		BigDecimal aBig = BigDecimal.valueOf(c);
		BigDecimal bBig = BigDecimal.valueOf(d);
		System.out.println("aBig - bBig = " + aBig.subtract(bBig));
		//do obiektu aBig przypisujemy wynik odejmowania aBig-bBig
		aBig = aBig.subtract(bBig);
		//dzia³anie
		BigInteger big = new BigInteger("12345678910123456789");
		big = big.multiply(BigInteger.valueOf(123456789));
		System.out.println(big);


	}

}
