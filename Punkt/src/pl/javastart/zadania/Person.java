package pl.javastart.zadania;

public class Person {
private String imie;
private String nazwisko;
private double wyplata;
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
public double getWyplata() {
	return wyplata;
}
public void setWyplata(double wyplata) {
	this.wyplata = wyplata;
}
public Person (){
	
}
public Person(String imie,String nazwisko, double wyplata){
	this.imie=imie;
	this.nazwisko=nazwisko;
	this.wyplata=wyplata;
}
@Override
public String toString() {
	return imie+" "+nazwisko+" "+wyplata;
}

}
