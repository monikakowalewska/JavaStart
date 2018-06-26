package pl.kobietydokodu.bazakotow.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kot {
	
String imie;
Date urodzenia;
float waga;
String nazwaOpiekuna;

public Date getUrodzenia() {
	return urodzenia;
}

public void setUrodzenia(Date urodzenia) {
	this.urodzenia = urodzenia;
}

public float getWaga() {
	return waga;
}

public void setWaga(float waga) {
	this.waga = waga;
}

public String getNazwaOpiekuna() {
	return nazwaOpiekuna;
}

public void setNazwaOpiekuna(String nazwaOpiekuna) {
	this.nazwaOpiekuna = nazwaOpiekuna;
}

public void setImie(String wsk_imie) {
	this.imie = wsk_imie;
}

public String getImie() {
    return this.imie;
}
public String przedstawSie(){
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	return imie +" urodzony dnia "+ df.format(urodzenia)+" wazy "+waga+" nalezy do "+nazwaOpiekuna;
}

  public static void main (String args[])
  {Kot kot_egz=new Kot();
	kot_egz.setImie("Milutek");
	kot_egz.setUrodzenia(new Date());
	kot_egz.setWaga(0.4f);
	kot_egz.nazwaOpiekuna = "Dexter";
	
	kot_egz.przedstawSie();
	
	  System.out.println(kot_egz.przedstawSie());
  }
}


