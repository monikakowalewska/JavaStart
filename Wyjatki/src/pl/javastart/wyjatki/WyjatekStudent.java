package pl.javastart.wyjatki;

public class WyjatekStudent {
	private int studentId;
	private String firstName;
	private String lastName;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

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

	public WyjatekStudent(int id, String fn, String ln) {
		setStudentId(id);
		setFirstName(fn);
		setLastName(ln);
	}

	@Override
	public String toString() {
		return studentId + " " + firstName + " " + lastName;
	}

}
