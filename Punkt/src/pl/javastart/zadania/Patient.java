package pl.javastart.zadania;

public class Patient {
private String imie;
private String nazwisko;
private int pesel;

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
public int getPesel() {
	return pesel;
}
public void setPesel(int pesel) {
	this.pesel = pesel;
}
public Patient() {
	
}

public Patient(String imie,String nazwisko, int pesel){
	this.imie=imie;
	this.nazwisko=nazwisko;
	this.pesel=pesel;
}
	public void print(){
		System.out.println(getImie()+" "+getNazwisko()+" "+getPesel());
}

}
