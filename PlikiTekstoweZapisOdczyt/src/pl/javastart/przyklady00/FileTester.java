package pl.javastart.przyklady00;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTester {
	public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            /*Kolejne wiersze mo�emy odczyta� za pomoc� metody readLine() i przypisa� je
            tak jak w naszym przyk�adzie do tymczasowej zmiennej nextLine typu String*/
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilo�� wierszy w pliku: " + lines);
        } catch (IOException e) {//FileNotFoundException dziedziczy po IOException
            e.printStackTrace();
        } finally {
            try {
            	//Je�li readLine() zwr�ci warto�� null, oznacza to, �e doszli�my do ko�ca pliku i nale�y wyj�� z p�tli
                if(reader != null)
                    reader.close();
            } catch (IOException e) {//problem odczytu pliku
                e.printStackTrace();
            }
        }
    }

}
