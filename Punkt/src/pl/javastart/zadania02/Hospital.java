package pl.javastart.zadania02;

import java.util.Scanner;

import pl.javastart.zadania.Patient;

public class Hospital {
	Patient []pat=new Patient[10];
	int i=0;
	Scanner odczyt = new Scanner(System.in);
	int x;
	
public void dopiszPacjenta (Patient patient){
	/*Patient patient = new Patient(null, null, x);*/
	odczyt.nextLine();
	System.out.println("Podaj imiê");
	String y = odczyt.nextLine();
	patient.setImie(y);
	System.out.println("Nazwisko");
	y = odczyt.nextLine();
	patient.setNazwisko(y);
	System.out.println("pesel");
	x = odczyt.nextInt();
	patient.setPesel(x);
	boolean czynapelniona=true;
		while(i<pat.length){
			if(pat[i]==null){
			pat[i]=patient;
		System.out.println("Wpisano pacjenta");
		czynapelniona=false;
		i++;
		break;}}
		if (czynapelniona==true){
			System.out.println("Brak wolnych miejsc");
		}
	
			}
public void print(){
try{for(Patient wypisz:pat)//for each
	wypisz.print();}
catch(NullPointerException e){
if(pat[i]==null)
	System.out.println("wolne miejsce");
}}
}