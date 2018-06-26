package pl.javastart.zadania02;


import pl.javastart.zadania.Computer;

public class DataStore {
	static final int MAX_ILOSC=100;
Computer[]tab=new Computer[MAX_ILOSC];
private int liczba_komputerow=0;

public int getLiczba_komputerow() {
	return liczba_komputerow;
}
public void setLiczba_komputerow(int liczba_komputerow) {
	this.liczba_komputerow = liczba_komputerow;
}

public void add(Computer comp){
	if (getLiczba_komputerow() < MAX_ILOSC) {
		tab[getLiczba_komputerow()] = comp;
		setLiczba_komputerow(getLiczba_komputerow() + 1);
	} else {
		System.out.println("Zapisano maxymaln¹ liczbê komputerów!");
	}
}
public void printInfo(){
	for(int i=0;i<getLiczba_komputerow();i++)
	System.out.println(tab[i]);}

	public int checkAvailability(Computer comp){//zwraca iloœæ takich samych komputerów w sklepie
		int takie_same=0;
		for(int i=0;i<getLiczba_komputerow();i++){
			if(tab[i].equals(comp)){
			takie_same++;
			}
		}
		return takie_same;
		/*else{
			System.out.println("Nie ma takich samych komputerów");
		}*/
	}


}
