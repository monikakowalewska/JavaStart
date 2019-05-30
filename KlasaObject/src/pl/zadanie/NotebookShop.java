package pl.zadanie;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore ds=new DataStore();
        ds.add(new Computer("Dell",1234));
        ds.add(new Computer("Dell",354));
        ds.add(new Computer("Dell",1234));
        ds.add(new Computer("Asus",34));
        ds.add(new Computer("Acer",4567));
        System.out.println(ds.toString());
        Computer compToFind = new Computer("Dell",1234);
        int computersFound = ds.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);
        System.out.println("Wszystkie dostêpne komputery: ");
        for (Computer c : ds.getComputers()) {
            if (c != null)
                System.out.println(c);
        }



    }
}
