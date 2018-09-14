package pl.javastart.przyklady00;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {//odczyt obiektów z plików
	public static void main(String[] args) {
		String fileName = "person.obj";
		
		Person p1 = null;
		
		try(
				FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {

		p1 = (Person) ois.readObject();//wymagane rzutowanie na odpowiedni typ, domyœlnie z klasy Object
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(p1 != null) {
			System.out.println("Wczytano dane o: ");
			System.out.println(p1.getFirstName() + " " + p1.getLastName());
		}
	}

}
