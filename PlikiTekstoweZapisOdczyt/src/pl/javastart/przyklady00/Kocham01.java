package pl.javastart.przyklady00;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kocham01 {
	public static void main(String[] args) {
        String fileName = "kochamFile.txt";
        try(
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {for(int i=0;i<100000;i++){
            writer.write("Kocham Ciê Waldek!!");
            writer.newLine();
        }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
