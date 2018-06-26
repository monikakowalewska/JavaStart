package dziedziczenie;
import java.util.Arrays;

public class TablicaPracownikowArrays {
	public static void main(String args[]){
    //Tworzymy kilku pracowników
    Pracownik krzysiek = new Pracownik("Krzysiek", "Piotrowicz", 2000);
    Pracownik piotrek = new Pracownik("Piotrek", "Wolny", 3000);
    Pracownik kasia = new Pracownik("Kasia", "Krotwicka", 2500);
    Pracownik wlodek = new Pracownik("Wlodek", "Zieba", 2300);
 
    //umieszczamy naszych pracowników w tablicy
    Pracownik[] prac = {krzysiek, piotrek, kasia, wlodek};
    //tworzymy obiekt komparatora, który wczeœniej napisaliœmy
    Komparator komp = new Komparator();
    //sortujemy tablicê przy u¿yciu komparatora
    Arrays.sort(prac, komp);
    //wyœwietlamy posortowan¹ tablicê
    wyswietl(prac);
    }
 
    //metoda wyœwietlajca tablicê w ³adnej formie
    public static void wyswietl(Pracownik[] prac){
        for(Pracownik p: prac)
            System.out.println(p.toString());
    }

}
