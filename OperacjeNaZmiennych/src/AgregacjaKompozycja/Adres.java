package AgregacjaKompozycja;

public class Adres {
    Person inhabitant;
    String street;
    int home;
    int flat;
    String city;
    String zipCode;

    public Person getInhabitant() {
        return inhabitant;
    }

    public void setInhabitant(Person inhabitant) {
        this.inhabitant = inhabitant;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberHouse() {
        return home;
    }

    public void setNumberHouse(int numberHouse) {
        this.home = numberHouse;
    }

    public int getNumberLoft() {
        return flat;
    }

    public void setNumberLoft(int numberLoft) {
        this.flat = numberLoft;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public Adres(Adres adres1){}
    public Adres(Person inhabitant,String street,int home,int flat,String city,String zipCode){
        this.inhabitant=inhabitant;
        this.street=street;
        this.home=home;
        this.flat=flat;
        this.city=city;
        this.zipCode=zipCode;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "mieszkaniec=" + inhabitant +
                ", ulica='" + street + '\'' +
                ", numer domu=" + home +
                ", numer mieszkania=" + flat +
                ", miasto='" + city + '\'' +
                ", kod pocztowy='" + zipCode + '\'' +
                '}';
    }

}
