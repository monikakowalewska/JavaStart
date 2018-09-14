package pl.javastart.przyklady00;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterTry {
	public static void main(String[] args) {
        String fileName = "testFile.txt";
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
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Iloœæ wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
