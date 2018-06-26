package pl.javastart.zadania02;

import pl.javastart.zadania.Part;

public class Tire extends Part{
	private int rozmiar;
	private int szerokosc;
	public int getRozmiar() {
		return rozmiar;
	}
	public void setRozmiar(int rozmiar) {
		this.rozmiar = rozmiar;
	}
	public int getSzerokosc() {
		return szerokosc;
	}
	public void setSzerokosc(int szerokosc) {
		this.szerokosc = szerokosc;
	}
public Tire(){}
public Tire (int rozmiar, int szerokosc, String model,int numerId, String producent,String seria){
	setRozmiar(rozmiar);
	setSzerokosc(szerokosc);
	setModel(model);
	setNumerIdent(numerId);
	setProducent(producent);
	setSeria(seria);
}
public void print(){
	System.out.println("Opony "+getNumerIdent()+" "+getModel()+" "+getProducent()+" "+getSeria()+" "+getRozmiar()+" "+getSzerokosc());
}
}
