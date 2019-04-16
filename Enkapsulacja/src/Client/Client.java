package Client;

public class Client {
    private String firstName;
    private String lastName;
    private boolean premium;

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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Client(String firstName, String lastName, boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;

    }
    public String printClient(){
        String result;
        if(firstName!=null&&lastName!=null)
           result="Witaj "+firstName+" "+lastName;
        else if(lastName==null&&firstName==null)
            result="Witaj nieznajomy";
        else if(firstName==null)
            result="Dzieñ dobry pani/panie "+lastName;
        else
            result="Witaj "+firstName;

        return result;
    }

}
