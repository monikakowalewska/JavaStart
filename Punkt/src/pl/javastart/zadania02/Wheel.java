package pl.javastart.zadania02;

import pl.javastart.zadania.Part;

public class Wheel extends Tire{
	public Wheel(){}
	public Wheel (int rozmiar, int szerokosc, String model,int numerId, String producent,String seria){
		setRozmiar(rozmiar);
		setSzerokosc(szerokosc);
		setModel(model);
		setNumerIdent(numerId);
		setProducent(producent);
		setSeria(seria);
	}
public void print(){
	System.out.println("Felgi "+getNumerIdent()+" "+getModel()+" "+getProducent()+" "+getSeria()+" "+getRozmiar()+" "+getSzerokosc());
}
}
