package pl.javastart.przyklady;

import java.io.File;

public class DirectoryLister {
	public static void main(String[] args) {
		DirectoryLister dl = new DirectoryLister();
		File file = new File("D:/");
		dl.showDirectories(file);
	}

	public void showDirectories(File file) {// argumentem obiekt klasy File, kt�ry powinien odzwierciedla� folder, kt�ry chcemy wylistowa�
		File[] files = file.listFiles();//Metoda listFiles() z klasy File zwraca list� plik�w i katalog�w w aktualnej �cie�ce lub warto�� null,
		//je�li obiekt file odzwierciedla plik

		if (files != null)
			for (File f : files) {
//				W p�tli for-each wywo�ujemy rekurencyjnie metod� showDirectories() dla ka�dego podfolderu,
//				wcze�niej wy�wietlaj�c przegl�dany folder, a pliki po prostu wy�wietlamy na ekranie.
				if (f.isDirectory()) {
					System.out.println("folder " + f.getAbsolutePath());
					showDirectories(f);
				} else {
					System.out.println("  plik " + f.getAbsolutePath());
				}
			}
	}

}
