import java.util.Scanner;

public class Firma {
	public static void main(String args[]){
		Pracownik pracownik1=new Pracownik (" Monika ", " Kowalewska ", 33);
		System.out.println("Dane 1 pracownika to: "+pracownik1.imie+pracownik1.nazwisko+pracownik1.wiek);
		Pracownik pracownik2=new Pracownik(pracownik1);
		System.out.println("Dane 1 pracownika to: ");
		pracownik2.print();
		
		
		 String[] tablicaImiona = {"Waldek", "Monika", "Wiktor"};
		  String[] tablicaNazwiska = {"Kowalewski", "Kowalewska", "Noname"};
		  int[] tablicaWiek = {35,33,5};
		  Pracownik []tablicaPracownik = new Pracownik[3];
		  
		  for(int x=0;x<tablicaPracownik.length;x++){ 
		   tablicaPracownik[x]=new Pracownik(tablicaImiona[x], tablicaNazwiska[x], tablicaWiek[x]);
		   tablicaPracownik[x].print();
		   }
		  /*====================================*/
		  Pracownik[] pracownicy = new Pracownik[3];
	        pracownicy[0] = new Pracownik();
	        pracownicy[1] = new Pracownik("Staszek", "Kowalski", 34);
	        pracownicy[2] = new Pracownik(pracownicy[1]);
	 
	        for(Pracownik p: pracownicy)
	            System.out.println("prac3: "+p.imie+" "+p.nazwisko+" "+p.wiek);
		
}
}