package pl.kobietydokodu.bazakotow.model;

public class Uruchom {
	public static void main(String args[]){
		Pracownik pracownik1_egz=new Pracownik();
		pracownik1_egz.setImie("Jan");
		pracownik1_egz.setNazwisko("Kowalski");
		pracownik1_egz.setWiek(30);

		pracownik1_egz.print();
		
		Pracownik pracownik2_egz=new Pracownik();
		pracownik2_egz.setImie("Konstanty");
		pracownik2_egz.setNazwisko("Iglowski");
		pracownik2_egz.setWiek(32);

		pracownik2_egz.print();
		
		Pracownik pracownik3_egz=new Pracownik();
/*		pracownik3_egz.setImie("Waldek");
		pracownik3_egz.setNazwisko("Kowalewski");
		pracownik3_egz.setWiek(34);*/

		pracownik3_egz.print();
	/*	
		Firma firma_egz= new Firma();
		firma_egz.setPracownik1(pracownik1_egz);
		firma_egz.setPracownik2(pracownik2_egz);
		firma_egz.setPracownik3(pracownik3_egz);
		
		firma_egz.print();*/
		
	}
}
