package pl.javastart.przyklady00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
	/*Konstruktor przyjmuj¹cy jako argument obiekt typu File deklaruje kontrolowany wyj¹tek
	FileNotFoundException, który dla czytelnoœci kodu zadeklarowaliœmy w metodzie main() poprzez throws zamiast obs³ugiwaæ go w bloku try catch.*/
	public static void main(String[] args) throws FileNotFoundException {
		//zmienn¹ przechowuj¹c¹ nazwê pliku
        String fileName = "testFile.txt";
        //obiekt typu File reprezentuj¹cy ten plik
        File file = new File(fileName);
        //konstruktor, który przyjmuje obiekt File
        Scanner scan = new Scanner(file);
        //deklarujemy zmienn¹ lines, która pos³u¿y nam do zliczenia iloœci wierszy w pliku
        int lines = 0;
        /*"dopóki z pliku jest jeszcze kolejny wiersz tekstu (scan.hasNextLine()) to go wczytaj i wyœwietl oraz zwiêksz zmienn¹ lines o 1"*/
        while(scan.hasNextLine()) {
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Iloœæ wierszy w pliku: " + lines);
        scan.close();//pamiêtamy o zamkniêciu - problemy z zapisem
    }

}
