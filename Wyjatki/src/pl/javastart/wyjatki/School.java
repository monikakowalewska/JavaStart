package pl.javastart.wyjatki;

public class School {
	private WyjatekStudent[] students;
	private int studentsNumber;

	public School(int studentsNumber) {
		students = new WyjatekStudent[studentsNumber];
		this.studentsNumber = 0;
	}

	public void add(WyjatekStudent s) throws NoMoreSpaceException {
		if (studentsNumber >= students.length) {
			throw new NoMoreSpaceException("Brak miejsca w School " + students.length);
		} else {
			students[studentsNumber] = s;
			studentsNumber++;
		}
	}

	public WyjatekStudent find(String firstName, String lastName) throws NoElementFoundException {
		boolean found = false;
		WyjatekStudent foundElement = null;
		int index = 0;
		while (!found  && index < students.length) {
			if (students[index].getFirstName().equals(firstName)
					&& students[index].getLastName().equals(lastName)) {
				foundElement = students[index];
				found = true;
			} else {
				index++;
			}
		}
		
		if(foundElement == null) {
			throw new NoElementFoundException("Nie znaleziono elementu " + firstName + " " + lastName);
		}
		
		return foundElement;
	}

}
