package pl.javastart.przyklady00;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {//zapis objektów do pliku
	public static void main(String[] args) {
		String fileName = "person.txt";
		Person p1 = new Person("Jan", "Kowalski");
		
		try(
				FileOutputStream fs = new FileOutputStream(fileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);//obudowanie klas¹ ObjectOutputStream
				) {
			os.writeObject(p1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Zapisano obiekt do pliku");
	}

}
