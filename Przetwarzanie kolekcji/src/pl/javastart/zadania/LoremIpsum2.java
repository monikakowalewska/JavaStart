package pl.javastart.zadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum2 {
	public static void main(String[] args) throws IOException {
        final String FILE_NAME = "loremipsum-129.txt";
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

        List<String> words = reader.lines()//Metoda lines() zwraca list� wierszy tekstu
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)//flatMap(Arrays::stream) przekszta�ca wi�c Stream<String[]> na Stream<String>
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyraz�w na 's': " + countSWords);
        System.out.println("Liczba wyraz�w z 5 literami: " + fiveLetters);

        reader.close();
    }

}
