/*package pl.kobietydokodu.bazakotow.model;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Strumienie {public static void main(String[] args) {
	String plik = "C:/Users/Monika/Documents/daneBinarne.txt";
	FileOutputStream strumieñWyjœciowy= new FileOutputStream(plik);
	DataOutputStream strumieñ = null;
	try {
	strumieñ = new DataOutputStream(new FileOutputStream("plik.txt"));
	} catch (FileNotFoundException e) {
	System.out.println("Nie znaleziono pliku");
	}
	
	try {
	
	             * Dowolne metody
	             
	} catch (IOException e) {
	            // Obs³u¿enie wyj¹tku
	}
	 
	 try {
	if (strumieñ != null)
	strumieñ.close();
	} catch (IOException e) {
		System.out.println("B³¹d zamykania strumienia");
		}
	}
}*/