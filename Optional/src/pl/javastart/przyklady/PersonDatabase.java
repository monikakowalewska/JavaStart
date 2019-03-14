package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
	 private List<Person> people = new ArrayList<>();

	    public void add(Person person) {
	        if (person == null)
	            throw new NullPointerException("Cannot add null reference");
	        if (findById(person.getId()).isEmpty())
	            throw new IllegalArgumentException("Object with such id already exists");
	        people.add(person);
	    }
	    public void add2(Person person) {
	        if (person == null)
	            throw new NullPointerException("Cannot add null reference");
	        findById(person.getId())
	            .ifPresent(p -> new IllegalArgumentException("Object with such id already exists"));
	        people.add(person);
	    }

	    public Optional<Person>findById(int id) {//ma zwr�ci� obiekt je�li ten istnieje lub pust� warto�� w przypadku, gdy jest brak wyniku.
	        for (Person person : people) {
	            if (person.getId() == id)
	                return Optional.of(person);
	        }
	        return Optional.empty();
	    }
	    public String findLastNameById(int id) {
	        for (Person person : people) {
	            if (person.getId() == id)
	                return person.getLastName();
	        }
	        return "Anonim";

	    }
	   /* public String findLastNameById(int id) {
	        return findById(id) // Optional<Person>
	        .map(Person::getLastName) // Optional<String>
	        .get();//get() mo�e wywo�a� problem je�li b�dzie null NoSuchElementException
	    }*/
	    public String findLastNameById2(int id) {
    return findById(id) // Optional<Person>
    .map(Person::getLastName) // Optional<String>
    .orElse("Anonim");//Korzystaj�c z metody orElse() lub orElseGet() mo�emy zwr�ci� obiekt, kt�ry przechowuje Optional, 
    //lub dostarczy� warto�� domy�ln�, je�li Optional jest pusty.
}
}