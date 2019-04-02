package AgregacjaKompozycja;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    Adres adres;
    Adres registeredAdres;

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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Adres getRegisteredAdres() {
        return registeredAdres;
    }

    public void setRegisteredAdres(Adres registeredAdres) {
        this.registeredAdres = registeredAdres;
    }

    public Person(){}
    public Person(String firstName,String lastName,String pesel){
        this.firstName=firstName;
        this.lastName=lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
