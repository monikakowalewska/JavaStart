package pl.kobietydokodu.bazakotow.model;

public class Pracownik {
String imie;
String nazwisko;
Integer wiek;


public String getImie() {
	return imie;
}
public void setImie(String imie) {
	this.imie = imie;
}
public String getNazwisko() {
	return nazwisko;
}
public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}
public Integer getWiek() {
	return wiek;
}
public void setWiek(Integer wiek) {
	this.wiek = wiek;
}
public void print(){
	System.out.println(imie +" "+ nazwisko + " "+ wiek);
}

}