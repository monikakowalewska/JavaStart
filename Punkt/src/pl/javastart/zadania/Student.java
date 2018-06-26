package pl.javastart.zadania;

public class Student {
	public static int liczbaStudentow;
private String imie;
private String nazwisko;
private int numerIndeksu;

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
public int getNumerIndeksu() {
	return numerIndeksu;
}
public void setNumerIndeksu(int numerIndeksu) {
	this.numerIndeksu = numerIndeksu;
}

public Student(){
	liczbaStudentow++;
};
public Student (String imie,String nazwisko,int numerIndeksu){
	setImie(imie);
	setNazwisko(nazwisko);
	setNumerIndeksu(numerIndeksu);
	liczbaStudentow++;
}


}
