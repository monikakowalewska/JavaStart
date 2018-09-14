package pl.javastart.przyklady00;

import java.io.Serializable;

public class Person implements Serializable{
private static final long serialVersionUID = 3812017177088226528L;
/*element opcjonalny, kt�ry pozwala na wersjonowanie klas. Jest ona generowana domy�lnie
przez kompilator na podstawie kilku element�w jak nazwa klasy i pola w niej zawarte. Dlatego je�li
zapiszesz jaki� obiekt, nast�pnie w klasie Person dodasz nowe pole, nawet prywatne,
to pr�ba odczytu obiektu z wcze�niej utworzonego pliku b�dzie niemo�liwa. 
Wygenerowanie samodzielnie sta�ej serialVersionUID pozwoli zachowa� kompatybilno�� wsteczn�.*/
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person(){}

	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
