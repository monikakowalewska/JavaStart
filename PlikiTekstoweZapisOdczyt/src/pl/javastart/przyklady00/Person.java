package pl.javastart.przyklady00;

import java.io.Serializable;

public class Person implements Serializable{
private static final long serialVersionUID = 3812017177088226528L;
/*element opcjonalny, który pozwala na wersjonowanie klas. Jest ona generowana domyœlnie
przez kompilator na podstawie kilku elementów jak nazwa klasy i pola w niej zawarte. Dlatego jeœli
zapiszesz jakiœ obiekt, nastêpnie w klasie Person dodasz nowe pole, nawet prywatne,
to próba odczytu obiektu z wczeœniej utworzonego pliku bêdzie niemo¿liwa. 
Wygenerowanie samodzielnie sta³ej serialVersionUID pozwoli zachowaæ kompatybilnoœæ wsteczn¹.*/
	
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
