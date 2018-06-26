package dziedziczenie;

public class Pracownik {
	private String imie;
    private String nazwisko;
    private double wyplata;
 
    public Pracownik(String imie, String nazwisko, double wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }
 
    String getImie(){ return imie; }
    String getNazwisko(){ return nazwisko; }
    double getWyplata(){ return wyplata; 
   }
    void print(){
    	System.out.println(imie+" "+nazwisko+" "+wyplata);
    }
    public String toString() {
        return "Imiê: "+imie+", Nazwisko: "+nazwisko+", Wyp³ata: "+wyplata;
    }
}
