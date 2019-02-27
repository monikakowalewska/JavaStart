package pl.javastart.przyklady;

import java.time.LocalDate;
import java.util.Scanner;

public class DatePatternTest2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworz� nowe wydarzenie.");
        System.out.println("Podaj dzie�");
        int day = sc.nextInt();
        System.out.println("Podaj miesi�c");
        int month = sc.nextInt();
        System.out.println("Podaj rok");
        int year = sc.nextInt();

        LocalDate createdDate = LocalDate.of(year, month, day);
        System.out.println("Wydarzenie utworzone na dzie� " + createdDate);
    }

}
