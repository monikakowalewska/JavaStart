/*package pl.kobietydokodu.bazakotow.model;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Strumienie {public static void main(String[] args) {
	String plik = "C:/Users/Monika/Documents/daneBinarne.txt";
	FileOutputStream strumie�Wyj�ciowy= new FileOutputStream(plik);
	DataOutputStream strumie� = null;
	try {
	strumie� = new DataOutputStream(new FileOutputStream("plik.txt"));
	} catch (FileNotFoundException e) {
	System.out.println("Nie znaleziono pliku");
	}
	
	try {
	
	�������������* Dowolne metody
	�������������
	} catch (IOException e) {
	������������// Obs�u�enie wyj�tku
	}
	�
	�try {
	if (strumie� != null)
	strumie�.close();
	} catch (IOException e) {
		System.out.println("B��d zamykania strumienia");
		}
	}
}*/