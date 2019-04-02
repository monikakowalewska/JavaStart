package AgregacjaKompozycja;

public class Adres {

    String street;
    int home;
    int flat;
    String city;
    String zipCode;


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
    public Adres(){}
    public Adres(String street,int home,int flat,String city,String zipCode){

        this.street=street;
        this.home=home;
        this.flat=flat;
        this.city=city;
        this.zipCode=zipCode;
    }

    @Override
    public String toString() {
        return "Adres{" +
                ", ulica='" + street + '\'' +
                ", numer domu=" + home +
                ", numer mieszkania=" + flat +
                ", miasto='" + city + '\'' +
                ", kod pocztowy='" + zipCode + '\'' +
                '}';
    }

}
