package pl.javastart.wyjatki;

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		try {
			school.add(new WyjatekStudent(1, "Jan", "Kowalski"));
			school.add(new WyjatekStudent(2, "Marek", "Bobowski"));
			school.add(new WyjatekStudent(3, "Karol", "Kwiatkowski"));
			school.add(new WyjatekStudent(4, "Ania", "Marciniak"));
		} catch (NoMoreSpaceException e) {
			System.err.println("Nie mo¿na dodaæ tylu osób do szko³y");
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(school.find("Marek", "Bobowski"));
			System.out.println(school.find("Janusz", "Danielak"));
		} catch (NoElementFoundException e) {
			System.err.println("Nie znaleziono takiej osoby!");
			System.err.println(e.getMessage());
		}
	}

}
