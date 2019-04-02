package KlasyIObiekty;

public class Employee {

    String firstname;
    String lastname;
    int age;
    int seniority;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public Employee(String firstname,String lastname,int age,int seniority) {
      this.firstname=firstname;
      this.lastname=lastname;
      this.age=age;
      this.seniority=seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", seniority=" + seniority +
                '}';
    }
}
