package pl.kobietydokodu.bazakotow.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestScanner {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String getUserInput() {
	    return sc.nextLine();
	    }
	    
	public static void main (String args[])
	{
		Kot kot_egz=new Kot();
		Pattern pat;
		Matcher mat;
		boolean found;
		
		String imieKota;
		//System.out.println(kot_egz.przedstawSie());
		do
		{
			System.out.print("Podaj imi� kota: ");
			imieKota = getUserInput();
			pat = Pattern.compile("[a-zA-Z]*");
		    mat = pat.matcher(imieKota);
		    found = mat.matches();
		    if (found)
		    	{break;}
		    else 
		    {
		    	System.out.println("Podaj imi� kota u�ywaj�c liter");
		    	continue;
		    }
	    }
		while (true);
	    
		Date date = null;
		String urodzenia; 
		
		do
		{
		System.out.println("Podaj date urodzenia w formacie RRRR.MM.DD:");
		urodzenia = getUserInput();
		
		pat = Pattern.compile("[0-9]{4}\\.[0-9]{2}\\.[0-9]{2}");//problem z kropkami
	    mat = pat.matcher(urodzenia);
	    found = mat.matches();//zwraca true lub false
	    if (found)
	    	{break;}
	    else 
	    {
	    	System.out.println("Z�y format daty. spr�buj jeszcze raz!");
	    	continue;
	    }
		}
		while (true);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		
	
		/*try {
		    date = sdf.parse(urodzenia);
		    
		    System.out.println("Brawo! Poda�e� w�a�ciwy format daty!");
		    break;//zly_format_daty = false;
		} catch (ParseException pe) {
		    System.out.println("Co� jest nie tak z formatem daty!");
		    continue;//zly_format_daty=true;
		}}
		while (true);//zly_format_daty);*/
		
		Float waga = new Float ("0");//nie wiem czy dobrze
		do{
		System.out.println("Podaj wage kota:");
		String waga_str = getUserInput();
		

		try{
			waga = waga.parseFloat(waga_str);
			System.out.println("Brawo! Poda�e� w�a�ciwy format wagi!");
		    break;
		}catch (NumberFormatException nfe) {
			System.out.println("Waga podana w z�ym formacie. U�yj liczb zmiennoprzecinkowych (w �odku kropka debilu)!");
			continue;
		}
		}
		while (true);
		
		
		String imieOpiekuna;
		do
		{
			System.out.print("Podaj imi� opiekuna: ");
			imieOpiekuna = getUserInput();
			pat = Pattern.compile("[a-zA-Z]*");
		    mat = pat.matcher(imieOpiekuna);
		    found = mat.matches();
		    if (found)
		    	{break;}
		    else 
		    {
		    	System.out.println("Podaj imi� opiekuna u�ywaj�c liter");
		    	continue;
		    }
	    }
		while (true);
	    
		kot_egz.setImie(imieKota);
		kot_egz.setUrodzenia(date);
		kot_egz.setWaga(waga);
		kot_egz.setNazwaOpiekuna(imieOpiekuna);
		//System.out.println(kot_egz.przedstawSie());
	}	
	}

