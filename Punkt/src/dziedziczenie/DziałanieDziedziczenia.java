package dziedziczenie;

public class Dzia³anieDziedziczenia {
	public static void main(String args[]){
		Pielegniarka pielegniarka1=new Pielegniarka("Monika","Kowalewska",2000);
	pielegniarka1.setNadgodziny(12);
	pielegniarka1.getNadgodziny();
	pielegniarka1.print();
	Lekarz lekarz1=new Lekarz("Waldek","kowalewski",3000,"proktolog");
	lekarz1.setPremia(450.00);
	lekarz1.getPremia();
	lekarz1.setSpecjalizacja("Onkolog");
	System.out.println("Dane lekarza "+lekarz1.getImie()+lekarz1.getNazwisko()+lekarz1.getWyplata()+lekarz1.getPremia());
	lekarz1.print();
	Pracownik[]tabprac=new Pracownik[3];
	tabprac[0]=new Pracownik("Wiktor","Kowalewski",4300.5);
	Pielegniarka piel=new Pielegniarka("Marysia","Pieñkowska",2004.7);
	piel.setNadgodziny(12);
	tabprac[1]=piel;
	Lekarz lek=new Lekarz("Tomek","Agent",5000,"pediatra");
	lek.setPremia(450.7);
	lek.setSpecjalizacja("pediatra");
	tabprac[2]=lek;
	int i=0;
	for(i=0;i<tabprac.length;i++){
		tabprac[i].print();
	}
	
	
	}
}