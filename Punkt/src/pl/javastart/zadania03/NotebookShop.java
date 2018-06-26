package pl.javastart.zadania03;

import pl.javastart.zadania.Computer;
import pl.javastart.zadania02.DataStore;

public class NotebookShop {
public static void main(String[] args) {
	DataStore ds=new DataStore();
	
	ds.add(new Computer("Dell",123));;
	ds.add(new Computer("Dell",345));;
	ds.add(new Computer("Dell",123));;
	ds.add(new Computer("Acer",123));;
	ds.add(new Computer("Lenovo",123));;
	ds.checkAvailability(new Computer("Dell",123));
	System.out.println(("Iloœæ takich samych komputerów jak Dell 123 "+ds.checkAvailability(new Computer("Dell",123))));
	ds.printInfo();
	
}
}
