package pl.javastart.zadania;

public class Company {
	public static void main(String[] args) {
		Employee pracownik1=new Employee();
		pracownik1.imie="Klaudia";
		pracownik1.nazwisko="Kowalska";
		pracownik1.rokUrodzenia=1990;
		pracownik1.stazPracy=2.5;
		pracownik1.print();
		Employee pracownik2=new Employee();
		pracownik2.imie="Matylda";
		pracownik2.nazwisko="Szostek";
		pracownik2.rokUrodzenia=1991;
		pracownik2.stazPracy=1.5;
		pracownik2.print();
		Employee pracownik3=new Employee();
		pracownik3.imie="Marek";
		pracownik3.nazwisko="Staszczuk";
		pracownik3.rokUrodzenia=1989;
		pracownik3.stazPracy=3.5;
		pracownik3.print();
		
	}
}
