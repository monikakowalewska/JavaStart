package pl.kobietydokodu.bazakotow.model;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
public static void main(String[] args) throws FileNotFoundException{

PrintWriter zapis = new PrintWriter("C:/Users/Monika/Documents/ala.txt");
zapis.println("Ala ma kota, a kot ma Alê");
zapis.close();
}
}
