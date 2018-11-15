package pl.javastart.zadania;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class PersonFromFile {
	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<>();
		System.out.println("Tablica ma elementów "+set.size());
		readData(set);
		System.out.println("Usuniêcie duplikatów");
		System.out.println("Tablica ma elementów "+set.size());
		for(String s: set) {
			System.out.println(s);
		}
		
	
	List<String> str = new ArrayList<>();
	str.addAll(set);
	str.sort(new Comparator<String>(){//klasa anonimowa
		@Override
		public int compare(String o1, String o2) {
			return o2.compareToIgnoreCase(o1);
		}});
	System.out.println("Posortowana z komparatorem");
	for(String s: str) {
		System.out.println(s);
	}
	
	System.out.println("Size: " + str.size());
	System.out.println("First: " + str.get(0));
	System.out.println("Last: " + str.get(str.size()-1));
	for(String s: set) {
		System.out.println(s);
	}
	}

	private static void readData(TreeSet<String> p_str) {
		 String fileName = "namespl.txt";
	        //Deklaracja i inicjalizacja obiektów 
	        try (
	            FileReader fileReader = new FileReader(fileName);
	            BufferedReader reader = new BufferedReader(fileReader);
	        		/*Wszystkie obiekty, które zostan¹ utworzone w tym miejscu, a implementuj¹ interfejs AutoCloseable 
	        		(w naszym przypadku oba z nich) zostan¹ automatycznie zamkniête, wiêc mo¿emy pozbyæ siê tak¿e ma³o czytelnego bloku finally.*/
	        ) {
	            String nextLine = null;
	            int lines = 0;
	            while ((nextLine = reader.readLine()) != null) {
	                /*System.out.println(nextLine);//wypisanie wszystkich elementow*/
	                p_str.add(nextLine);//dodawanie elementu do ArrayList, zape³nieine tablicy
	                lines++;
	            }
	            /*System.out.println("Iloœæ wierszy w pliku: " + lines);*/
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	

		
}
