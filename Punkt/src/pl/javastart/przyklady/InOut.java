package pl.javastart.przyklady;

import java.util.Locale;
import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String firstName;
	String lastName;
	int age;
	
	System.out.println("Wprowad� swoje imi�: ");
	firstName = input.nextLine();
	System.out.println("Wprowad� swoje nazwisko: ");
	lastName = input.nextLine();
	System.out.println("Podaj sw�j wiek: ");
	age = input.nextInt();
	
	input.useLocale(Locale.US);//dzi�ki temu mo�esz wpisywa� liczby double z kropka w �rodku zamiast przecinka 

	System.out.println("Podaj A: ");
	double a = input.nextDouble();
	System.out.println("Podaj B: ");
	double b = input.nextDouble();

	
	input.close();// powoduje zamkni�cie strumienia wej�cia (System.in)
	
	System.out.println("Cze�� " + firstName + " " + lastName);
	System.out.println("Masz ju� " + age + ", staro�� nie rado��! :)");
	System.out.println("A + B = " + (a+b));

}


}
