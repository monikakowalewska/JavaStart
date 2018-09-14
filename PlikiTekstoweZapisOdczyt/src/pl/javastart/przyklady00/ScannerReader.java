package pl.javastart.przyklady00;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
	/*Konstruktor przyjmuj�cy jako argument obiekt typu File deklaruje kontrolowany wyj�tek
	FileNotFoundException, kt�ry dla czytelno�ci kodu zadeklarowali�my w metodzie main() poprzez throws zamiast obs�ugiwa� go w bloku try catch.*/
	public static void main(String[] args) throws FileNotFoundException {
		//zmienn� przechowuj�c� nazw� pliku
        String fileName = "testFile.txt";
        //obiekt typu File reprezentuj�cy ten plik
        File file = new File(fileName);
        //konstruktor, kt�ry przyjmuje obiekt File
        Scanner scan = new Scanner(file);
        //deklarujemy zmienn� lines, kt�ra pos�u�y nam do zliczenia ilo�ci wierszy w pliku
        int lines = 0;
        /*"dop�ki z pliku jest jeszcze kolejny wiersz tekstu (scan.hasNextLine()) to go wczytaj i wy�wietl oraz zwi�ksz zmienn� lines o 1"*/
        while(scan.hasNextLine()) {
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Ilo�� wierszy w pliku: " + lines);
        scan.close();//pami�tamy o zamkni�ciu - problemy z zapisem
    }

}
