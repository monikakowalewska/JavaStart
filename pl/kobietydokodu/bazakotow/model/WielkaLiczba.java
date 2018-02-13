package pl.kobietydokodu.bazakotow.model;

import java.math.BigInteger;

public class WielkaLiczba {
	public static void main(String[] args){
	BigInteger wielkaLiczba = new BigInteger("12312312312312312312");
	System.out.println(wielkaLiczba.toString());
	
	BigInteger a = new BigInteger("-123123123123123123123123123123");
	BigInteger b = new BigInteger("98765432198765432198765432198");
	BigInteger suma = a.add(b);
	System.out.println("Suma "+suma.toString());
	BigInteger roznica=a.subtract(b);
	System.out.println("Ró¿nica "+roznica.toString());
	BigInteger iloczyn=a.multiply(b);
	System.out.println("Iloczyn "+iloczyn.toString());
	BigInteger iloraz=a.divide(b);
	System.out.println("Iloraz "+iloraz.toString());
	BigInteger iloraz2=b.divide(a);
	System.out.println("Iloraz 2 "+iloraz.toString());
	BigInteger wartoscBezwzgledna=a.abs();
	System.out.println("Wartoœæ bezwzglêdna z a "+wartoscBezwzgledna.toString());
	BigInteger potega=a.pow(2);
	System.out.println("Potêga 2 stopnia liczby a "+potega.toString());
	
	System.out.println("a+b= "+a.add(b).toString());
	System.out.println("a-b= "+a.subtract(b).toString());
	System.out.println("a*b= "+a.multiply(b).toString());
	System.out.println("a/b= "+a.divide(b).toString());
	System.out.println("a^12= "+a.pow(12));
	System.out.println("|a|= "+a.abs());
	
	}
}
