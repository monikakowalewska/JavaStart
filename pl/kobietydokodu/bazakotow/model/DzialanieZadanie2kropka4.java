package pl.kobietydokodu.bazakotow.model;

public class DzialanieZadanie2kropka4 {
	public static void main(String args[]){
		Zadanie2kropka4 obiekt=new Zadanie2kropka4();
		byte a=3;
		byte b=2;
		byte c=1;
		byte d=4;
		System.out.println("1.Suma zwraca typ byte z argumentami byte i byte wynosi "+obiekt.dodaj(a, b));
		System.out.println("2.Suma zwraca typ short z argumentami byte i short wynosi "+ obiekt.dodaj(a, b, c, d));
		System.out.println("3.Suma zwraca typ int z argumentami int i int wynosi "+ obiekt.dodaj((int)a, (int)b));
		System.out.println("4.Suma zwraca typ long z argumentami int i long wynosi "+ obiekt.dodaj((long)a, (long)b,(long) c));
		System.out.println("5.Suma zwraca typ float z argumentami float, long i int wynosi "+ obiekt.dodaj((float)a,(long) b,(int) c));
		System.out.println("6.Suma zwraca typ double z argumentami double wynosi "+ obiekt.dodaj((double)a, (double)b,(double) c));
}
	}
