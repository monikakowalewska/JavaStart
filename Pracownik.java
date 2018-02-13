
public class Pracownik {
	String imie;
	String nazwisko;
	int wiek;
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
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	public Pracownik(){}
	public Pracownik(String imie1, String nazwisko1,int wiek1){
		imie=imie1;
		nazwisko=nazwisko1;
		wiek=wiek1;
	}
	public Pracownik(Pracownik pracownik){
		imie=pracownik.imie;
		nazwisko=pracownik.nazwisko;
		wiek=pracownik.wiek;
	}
	public Pracownik(String imie, String nazwisko){

	}
public void print(){
	System.out.println("Dane pracownika "+imie+nazwisko+wiek);
}
}
