package pl.javastart.zadania;

import java.util.Arrays;

public class PersonDatabase {
Person[]person;
int personNumber=0;


public int getPersonNumber() {
	return personNumber;
}

public void setPersonNumber(int personNumber) {
	this.personNumber = personNumber;
}

public Person[] getPerson() {
	return person;
}

public void setPerson(Person[] person) {
	this.person = person;
}
public PersonDatabase() {//konstruktor
	person = new Person[1];

}

public void add(Person p)  {
	if(personNumber == person.length) {
		Person[] person2 = new Person[person.length*2];
		System.arraycopy(person, 0, person2, 0, person.length);	
		person=person2;
	}

	person[personNumber] = p;
	personNumber++;
}

public void remove(Person p){
	for(int i=0;i<personNumber;i++){
		if(p.equals(person[i])){
			Person[] person2 = new Person[person.length];
			System.arraycopy(person,i+1, person2, i, person.length-i-1);//	pierwsza instrukcja
			System.arraycopy(person,0, person2,0, i);	//druga instrukcja
			person=person2;
			System.out.println("Lista po usuniêciu obiektu: ");
			for(Person num: person) {
				System.out.print(num + " ");
				System.out.println("");
			}
		};
	}
}
public Person get(int i)throws ArrayIndexOutOfBoundsException {
		if (i ==0 || i < 0) {
			throw new ArrayIndexOutOfBoundsException("B³êdny parametr");
		}
	System.out.println("Obiekt na podanym indexie to "+person[i]);
	return person[i];	
}
public int size(){
	int counter=0;
	for(int i=0;i<person.length;i++){
		if(person[i]!=null){
			counter++;
		}
	}
	System.out.println("Liczba obiektów w tablicy to: "+counter);
	return counter;
}

@Override
public String toString() {
	System.out.println("Lista osób dziêki metodzie toString()");
	System.out.println("PersonDatabase [person=" + Arrays.toString(person) + ", personNumber=" + personNumber + "]");
	return "PersonDatabase [person=" + Arrays.toString(person) + ", personNumber=" + personNumber + "]";
}

}
