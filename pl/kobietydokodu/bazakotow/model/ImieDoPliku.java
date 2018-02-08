package pl.kobietydokodu.bazakotow.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class ImieDoPliku {
	public static void main(String[] args)throws FileNotFoundException
	{
		System.out.println("Podaj swoje imiê");
		String imie;
		Scanner odczytImie=new Scanner(System.in);
		imie=odczytImie.nextLine();
		
		PrintWriter zapis = new PrintWriter("C:/Users/Monika/Documents/imieDoPliku.txt");
		zapis.println(imie);
		zapis.close();
		
		File plik = new File("C:/Users/Monika/Documents/imieDoPliku.txt");
		Scanner in = new Scanner(plik);
		String imieZpliku = in.nextLine();
		System.out.println(imieZpliku);
		//Scanner odczyt = new Scanner(new File("C:/Users/Monika/Documents/imieDoPliku.txt"));
		//System.out.println(odczyt.nextLine());
}
}
