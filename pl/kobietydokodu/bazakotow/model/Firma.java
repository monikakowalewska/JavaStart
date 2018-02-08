package pl.kobietydokodu.bazakotow.model;

public class Firma {
	Pracownik p1;
	Pracownik p2;
	public Pracownik getP1() {
		return p1;
	}
	public void setP1(Pracownik p1) {
		this.p1 = p1;
	}
	public Pracownik getP2() {
		return p2;
	}
	public void setP2(Pracownik p2) {
		this.p2 = p2;
	}
	

	public static void main(String[] args){
		Firma f1=new Firma();
		f1.p1=new Pracownik();
		f1.p1.setImie("Waldek");
		f1.p1.setNazwisko("Kowalewski");
		f1.p1.setWiek(35);
		f1.p2=new Pracownik();
		f1.p2.setImie("Monika");
		f1.p2.setNazwisko("Kowalewska");
		f1.p2.setWiek(33);
		
		
			f1.p1.print();
			f1.p2.print();
			
			
			//======================================================================
			String[] tablicaImiona = {"Waldek", "Monika", "Wiktor"};
			String[] tablicaNazwiska = {"Kowalewski", "Kowalewska", "Noname"};
			int[] tablicaWiek = {35,33,5};
			Pracownik[]tablicaPracownik=new Pracownik[3];
			
			for(int x=0;x<tablicaPracownik.length;x++){
				tablicaPracownik[x]=new Pracownik();
				tablicaPracownik[x].setImie(tablicaImiona[x]);
				tablicaPracownik[x].setNazwisko(tablicaNazwiska[x]);
				tablicaPracownik[x].setWiek(tablicaWiek[x]);
				tablicaPracownik[x].print();
				
			}
			////==========petla while======================
			int x=0;
			while(x<tablicaPracownik.length){
				tablicaPracownik[x]=new Pracownik();
				tablicaPracownik[x].setImie(tablicaImiona[x]);
				tablicaPracownik[x].setNazwisko(tablicaNazwiska[x]);
				tablicaPracownik[x].setWiek(tablicaWiek[x]);
				tablicaPracownik[x].print();
				x++;
			}
			////=============do-while========
			x=0;
			do{
				tablicaPracownik[x]=new Pracownik();
			tablicaPracownik[x].setImie(tablicaImiona[x]);
			tablicaPracownik[x].setNazwisko(tablicaNazwiska[x]);
			tablicaPracownik[x].setWiek(tablicaWiek[x]);
			tablicaPracownik[x].print();
			x++;}
			while(x<tablicaPracownik.length);
			
	}
	}
		/*System.out.println("Dane pracowników to:("+p1.getImie()+p1.getNazwisko()+p1.getWiek()+")");
		
}*/
		/*public void print () {
	   // wyswietl dane pracownikow p1 i p2
	 }
	}

	a w funkcji main musisz 

	1. utworzyæ obiekt klasy Firma

	2. Przypisaæ dane (imiê, nazwisko, wiek) do p1 i p2*/

	/*3. wywo³aæ funkcjê print napisan¹ w klasie Firma*/
/*	Pracownik pracownik1;
	Pracownik pracownik2;
	Pracownik pracownik3;
	public Pracownik getPracownik1() {
		return pracownik1;
	}
	public void setPracownik1(Pracownik pracownik1) {
		this.pracownik1 = pracownik1;
	}
	public Pracownik getPracownik2() {
		return pracownik2;
	}
	public void setPracownik2(Pracownik pracownik2) {
		this.pracownik2 = pracownik2;
	}
	public Pracownik getPracownik3() {
		return pracownik3;
	}
	public void setPracownik3(Pracownik pracownik3) {
		this.pracownik3 = pracownik3;
	}
	public void print(){
		pracownik1.print();
		pracownik2.print();
		pracownik3.print();*/
	
	

