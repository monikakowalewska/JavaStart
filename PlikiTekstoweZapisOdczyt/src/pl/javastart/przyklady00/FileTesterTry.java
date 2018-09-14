package pl.javastart.przyklady00;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterTry {
	public static void main(String[] args) {
        String fileName = "testFile.txt";
        //Deklaracja i inicjalizacja obiekt�w 
        try (
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
        		/*Wszystkie obiekty, kt�re zostan� utworzone w tym miejscu, a implementuj� interfejs AutoCloseable 
        		(w naszym przypadku oba z nich) zostan� automatycznie zamkni�te, wi�c mo�emy pozby� si� tak�e ma�o czytelnego bloku finally.*/
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilo�� wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
