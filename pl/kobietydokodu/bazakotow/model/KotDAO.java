package pl.kobietydokodu.bazakotow.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KotDAO {
	public List<Kot> koty = new ArrayList<Kot>();
	void dodaj_kota(Kot wskaznik_kot){
		koty.add(wskaznik_kot);
	};
	public static void main (String args[]){
		KotDAO kot_egzDAO=new KotDAO();
		Kot kot_egz=new Kot();
		kot_egz.setImie ("Milutek");
		kot_egz.setUrodzenia(new Date());
		kot_egz.setWaga(0.4f);
		kot_egz.nazwaOpiekuna = "Dexter";
		
		kot_egzDAO.dodaj_kota(kot_egz);
		kot_egzDAO.dodaj_kota(kot_egz);
		kot_egzDAO.dodaj_kota(kot_egz);
		kot_egzDAO.dodaj_kota(kot_egz);
		kot_egzDAO.dodaj_kota(kot_egz);
		
		System.out.println("#1 normal for loop");
		for (int i = 0; i < kot_egzDAO.koty.size(); i++) {
			System.out.println(i +") "+kot_egzDAO.koty.get(i).przedstawSie());
		}

}
}
