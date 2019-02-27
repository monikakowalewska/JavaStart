package pl.javastart.przyklady;

import java.time.LocalDate;
import java.util.Scanner;

public class DatePatternTest2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzê nowe wydarzenie.");
        System.out.println("Podaj dzieñ");
        int day = sc.nextInt();
        System.out.println("Podaj miesi¹c");
        int month = sc.nextInt();
        System.out.println("Podaj rok");
        int year = sc.nextInt();

        LocalDate createdDate = LocalDate.of(year, month, day);
        System.out.println("Wydarzenie utworzone na dzieñ " + createdDate);
    }

}
