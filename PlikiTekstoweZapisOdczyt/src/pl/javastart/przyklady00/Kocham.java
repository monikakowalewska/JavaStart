package pl.javastart.przyklady00;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Kocham {
	public static void main(String[] args) {
		String fileName = "kochamFile.txt";
		File file = new File(fileName);
		
		boolean fileExists = file.exists();
		if(!fileExists) {
			try {
				fileExists = file.createNewFile();
			} catch (IOException e) {
				System.out.println("Nie uda³o siê utworzyæ pliku");
			}
		}
		
		if(fileExists)
			System.out.println("Plik " + fileName + " istnieje lub zosta³ utworzony");
	}

}
