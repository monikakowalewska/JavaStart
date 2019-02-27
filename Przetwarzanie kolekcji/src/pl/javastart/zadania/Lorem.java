package pl.javastart.zadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lorem {
	public static void main(String[] args) {
		String fileName = "loremipsum-129.txt";
		List<String> slowa = new ArrayList<String>();
		// Deklaracja i inicjalizacja obiektów
		try (FileReader fileReader = new FileReader(fileName); BufferedReader reader = new BufferedReader(fileReader);
		/*
		 * Wszystkie obiekty, które zostan¹ utworzone w tym miejscu, a
		 * implementuj¹ interfejs AutoCloseable (w naszym przypadku oba z nich)
		 * zostan¹ automatycznie zamkniête, wiêc mo¿emy pozbyæ siê tak¿e ma³o
		 * czytelnego bloku finally.
		 */
		) {
			String nextLine = null;
			int lines = 0;
			while ((nextLine = reader.readLine()) != null) {
				/* System.out.println(nextLine); */
				lines++;
				if (nextLine.length() != 0) {
					String s = new String(nextLine);
					String[] strings = s.split(" ");// korzystam z metody
													// split()- robi siê tablica
					for (String x : strings)
						slowa.add(x);// ka¿dy element tablicy wpisujê do listy
				}

			}
			System.out.println("Iloœæ wierszy w pliku: " + lines);
			for (String x : slowa)
				System.out.println(x);
			System.out.println(slowa.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		slowa = slowa.stream()// najpierw ogarniam kolekcjê z bia³ych znaków i
								// przecinków
				.map(String::trim).map(s -> s.replace(",", "").replace(".", "").replaceAll("\\.", ""))
				.collect(Collectors.toCollection(ArrayList<String>::new));
		List<String> letterS = slowa.stream()// szukam z ca³ej kolekcji s³ów na s
				.filter(word -> (word.charAt(0) == 's' || word.charAt(0) == 'S')) /// *koniunkcja:
				.collect(Collectors.toCollection(ArrayList<String>::new));
		/* letterS.forEach(System.out::println); */
		System.out.println("Iloœæ s³ów na literê s wynosi " + letterS.size());

		List<String> length5 = slowa.stream()// szukam z ca³ej kolekcji s³ów 5literowych

				.filter(word -> word.length() == 5)
				.collect(Collectors.toCollection(ArrayList::new));

		length5.forEach(System.out::println);
		System.out.println("Iloœæ s³ów 5literowych to " + length5.size());

	}
}
