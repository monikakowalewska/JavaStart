package dziedziczenie;
import java.util.Arrays;

public class TablicaPracownikowArrays {
	public static void main(String args[]){
    //Tworzymy kilku pracownik�w
    Pracownik krzysiek = new Pracownik("Krzysiek", "Piotrowicz", 2000);
    Pracownik piotrek = new Pracownik("Piotrek", "Wolny", 3000);
    Pracownik kasia = new Pracownik("Kasia", "Krotwicka", 2500);
    Pracownik wlodek = new Pracownik("Wlodek", "Zieba", 2300);
 
    //umieszczamy naszych pracownik�w w tablicy
    Pracownik[] prac = {krzysiek, piotrek, kasia, wlodek};
    //tworzymy obiekt komparatora, kt�ry wcze�niej napisali�my
    Komparator komp = new Komparator();
    //sortujemy tablic� przy u�yciu komparatora
    Arrays.sort(prac, komp);
    //wy�wietlamy posortowan� tablic�
    wyswietl(prac);
    }
 
    //metoda wy�wietlajca tablic� w �adnej formie
    public static void wyswietl(Pracownik[] prac){
        for(Pracownik p: prac)
            System.out.println(p.toString());
    }

}
