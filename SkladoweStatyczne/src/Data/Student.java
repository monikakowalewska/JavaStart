package Data;

public class Student {
    public static int licznik=0;
    private String firstName;
    private String lastName;
    private String index;

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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
    public Student(){};
    public Student(String firstName,String lastName,String index){
        this.firstName=firstName;
        this.lastName=lastName;
        this.index=index;
        licznik++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}
