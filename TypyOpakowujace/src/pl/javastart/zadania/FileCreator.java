package pl.javastart.zadania;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
		public static void main(String[] args) {
	        String fileName = "numbers.txt";
	        try(
	            FileWriter fileWriter = new FileWriter(fileName,true);
	            BufferedWriter writer = new BufferedWriter(fileWriter);
	        ) {
	            writer.write("123");
	            writer.newLine();
	            writer.write("1234");
	            writer.newLine();
	            writer.write("12345");
	            writer.write("123456789123456789");
	            writer.newLine();
	            writer.write("987654321987654321");
	            writer.newLine();
	            writer.close();
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	    }

}
