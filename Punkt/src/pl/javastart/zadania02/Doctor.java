package pl.javastart.zadania02;

import pl.javastart.zadania.Person;

public class Doctor extends Person{
	private double bonus;
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Doctor(String imie, String nazwisko, double wyplata,double bonus){
		super(imie, nazwisko, wyplata);
		this.bonus=bonus;
	}

	@Override
	public String toString() {
		return super.toString()+" "+bonus+" ";
	}

	

}
