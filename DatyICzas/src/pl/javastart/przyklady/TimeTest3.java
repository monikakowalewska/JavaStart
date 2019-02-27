package pl.javastart.przyklady;

import java.time.LocalDate;

public class TimeTest3 {//Prosty program, kt�ry por�wna dwie daty
	public static void main(String[] args) throws InterruptedException {
        LocalDate now = LocalDate.now();
        LocalDate firstJan2014 = LocalDate.of(2014, 1, 1);

        boolean check = now.isAfter(firstJan2014);
        System.out.println("Czy " + now + " jest po " + firstJan2014 + "?");
        System.out.println(check);
    }

}
