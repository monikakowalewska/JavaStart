package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
	 private List<Person> people = new ArrayList<>();

	    public void add(Person person) {
	        if (person == null)
	            throw new NullPointerException("Cannot add null reference");
	        if (findById(person.getId()) != null)
	            throw new IllegalArgumentException("Object with such id already exists");
	        people.add(person);
	    }

	    public Person findById(int id) {
	        for (Person person : people) {
	            if (person.getId() == id)
	                return person;
	        }
	        return null;
	    }

}
