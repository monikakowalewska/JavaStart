package pl.kobietydokodu.bazakotow.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Firany {
	
	int szerokosc;
	String tekstura;
	
public int getSzerokosc() {
		return szerokosc;
	}
	public void setSzerokosc(int szerokosc) {
		this.szerokosc = szerokosc;
	}
	public String getTekstura() {
		return tekstura;
	}
	public void setTekstura(String tekstura) {
		this.tekstura = tekstura;
	}
	public String dane_firanki(){
		return szerokosc +tekstura;
	}
	
}
