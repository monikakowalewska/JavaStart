package pl.kobietydokodu.bazakotow.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Blad {
	public static void main (String args[])
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date date = null;
		try {
		    date = sdf.parse("2017.07.21");
		} catch (ParseException pe) {
		    System.out.println("Coœ jest nie tak z formatem daty!");
		}
		//tu sprawdzamy
		
	}

}
