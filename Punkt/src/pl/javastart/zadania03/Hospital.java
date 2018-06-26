package pl.javastart.zadania03;

import pl.javastart.zadania.Person;
import pl.javastart.zadania02.Doctor;

public class Hospital {
	public static final int MAX_ILOSC=30;
	private Person[]persons;
	private int personNumber;
	public Hospital(){
		setPersons(new Person[MAX_ILOSC]);
	}
	public int getPersonsNumber() {
		return personNumber;
	}
	public void setPersonsNumber(int personsNumber) {
		this.personNumber = personsNumber;
	}
	public Person[] getPersons() {
		return persons;
	}
	public void setPersons(Person[] persons) {
		this.persons = persons;
	}
public void addPerson(Person person){
if (personNumber < MAX_ILOSC) {
			persons[personNumber] = person;
			personNumber++;
		} else {
			System.out.println("Maxymalna liczba osób zosta³a osi¹gniêta");
		}

	}
@Override
public String toString(){
	String result = "";
	for (int i=0;i<personNumber;i++) {
		result += persons[i].toString();
	}
	return result;
}
}



