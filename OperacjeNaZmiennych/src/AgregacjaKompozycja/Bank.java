package AgregacjaKompozycja;

public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person( "Jan","Kowalski","90897812362");
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;
        Adres adres1 = new Adres("Czerniakowska",34,156,
                "Warszawa","02-333");

        person1.adres=adres1;
        person1.registeredAdres=adres1;
        Credit credit1 = new Credit(person1,2000,0,0.05,12);
        System.out.println(person1+"posiada konto bankowe z kwot¹: " + account1.balance+
                "oraz kredyt na kwotê: " + credit1.cashBorrowed);
        System.out.println(person1+" zamieszka³y "+adres1+" ma na koncie "+account1.balance+" dane kredytu "+credit1);

        Person person2=new Person("Janka","Nowak","88021255566");
        BankAccount account2 = new BankAccount();
        account2.owner=person2;
        account2.balance = 15_000;
        Adres adres2=new Adres("Czerniakowska",34,156,
                "Warszawa","02-333");
        person2.adres=adres2;
        Adres registeredAdres2=new Adres("Burakowska",33,166,
                "Warszawa","02-333");
        person2.registeredAdres=registeredAdres2;
        Credit credit2 = new Credit(person2,3000,500,0.05,12);
        System.out.println(person2+" zamieszka³y "+adres2+" ma na koncie "+account2.balance+" dane kredytu "+credit2);



    }
}
