package pl.javastart.przyklady;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePatternTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworz� nowe wydarzenie.");
        System.out.println("Podaj dat� w formacie dd-MM-yyyy");

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateInput = sc.nextLine();
        LocalDate createdDate = LocalDate.parse(dateInput, datePattern);
        System.out.println("Wydarzenie utworzone na dzie� " + createdDate);
    }

}
