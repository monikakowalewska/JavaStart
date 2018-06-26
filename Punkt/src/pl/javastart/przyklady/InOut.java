package pl.javastart.przyklady;

import java.util.Locale;
import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String firstName;
	String lastName;
	int age;
	
	System.out.println("WprowadŸ swoje imiê: ");
	firstName = input.nextLine();
	System.out.println("WprowadŸ swoje nazwisko: ");
	lastName = input.nextLine();
	System.out.println("Podaj swój wiek: ");
	age = input.nextInt();
	
	input.useLocale(Locale.US);//dziêki temu mo¿esz wpisywaæ liczby double z kropka w œrodku zamiast przecinka 

	System.out.println("Podaj A: ");
	double a = input.nextDouble();
	System.out.println("Podaj B: ");
	double b = input.nextDouble();

	
	input.close();// powoduje zamkniêcie strumienia wejœcia (System.in)
	
	System.out.println("Czeœæ " + firstName + " " + lastName);
	System.out.println("Masz ju¿ " + age + ", staroœæ nie radoœæ! :)");
	System.out.println("A + B = " + (a+b));

}


}
