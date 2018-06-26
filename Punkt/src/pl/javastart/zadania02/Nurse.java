package pl.javastart.zadania02;

import pl.javastart.zadania.Person;

public class Nurse extends Person{
	private int nadgodziny;
	public int getNadgodziny() {
		return nadgodziny;
	}
	public void setNadgodziny(int nadgodziny) {
		this.nadgodziny = nadgodziny;
	}
	public Nurse(String imie, String nazwisko, double wyplata,int nadgodziny){
		super(imie, nazwisko, wyplata);
		this.setNadgodziny(nadgodziny);
	}
	@Override
	public String toString() {
		return super.toString()+" "+nadgodziny+" ";
	}


}
