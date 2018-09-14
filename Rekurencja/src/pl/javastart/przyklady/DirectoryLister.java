package pl.javastart.przyklady;

import java.io.File;

public class DirectoryLister {
	public static void main(String[] args) {
		DirectoryLister dl = new DirectoryLister();
		File file = new File("D:/");
		dl.showDirectories(file);
	}

	public void showDirectories(File file) {// argumentem obiekt klasy File, który powinien odzwierciedlaæ folder, który chcemy wylistowaæ
		File[] files = file.listFiles();//Metoda listFiles() z klasy File zwraca listê plików i katalogów w aktualnej œcie¿ce lub wartoœæ null,
		//jeœli obiekt file odzwierciedla plik

		if (files != null)
			for (File f : files) {
//				W pêtli for-each wywo³ujemy rekurencyjnie metodê showDirectories() dla ka¿dego podfolderu,
//				wczeœniej wyœwietlaj¹c przegl¹dany folder, a pliki po prostu wyœwietlamy na ekranie.
				if (f.isDirectory()) {
					System.out.println("folder " + f.getAbsolutePath());
					showDirectories(f);
				} else {
					System.out.println("  plik " + f.getAbsolutePath());
				}
			}
	}

}
