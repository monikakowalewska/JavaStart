package pl.javastart.zadania;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class OperacjeZapisDoPliku {
	public static void main(String[] args) {
		Paczka paczka=new Paczka();
//		String[]taboo={"123","1234","12345","123456789123456789","987654321987654321"};
//		paczka.setTab(taboo);
		
		/*String[]tab;*/
		String fileName = "operacjeFile.txt";
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			{
				oos.writeObject(paczka);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
