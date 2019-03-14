package pl.javastart.przyklady;

import java.util.Optional;

public class PersonTest {
	public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));
        
        Optional<Person> personOpt1 = db.findById(2); // Karol Zawadzki
        Optional<Person> personOpt2 = db.findById(55); // null
        
      /*  System.out.println(personOpt1.getLastName());
        System.out.println(personOpt2.getLastName()); //NullPointerException
*/        
        personOpt1.ifPresent(p -> System.out.println(p.getLastName()));
		personOpt2.ifPresent(p -> System.out.println(p.getLastName()));
		if(personOpt1.isPresent()) {
		    System.out.println(personOpt1.get().getLastName());
		}
		personOpt2.ifPresentOrElse(
        p -> System.out.println(p.getLastName()), 
        () -> System.out.println("Brak obiektu o wskazanym id"));
		if(personOpt2.isPresent()) {
		    System.out.println(personOpt2.get().getLastName());
		} else {
		    System.out.println("Brak obiektu o wskazanym id");
		}
		db.findById(2).ifPresent(p -> System.out.println(p.getLastName()));
    }

}
