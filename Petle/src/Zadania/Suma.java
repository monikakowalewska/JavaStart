package Zadania;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczba;
        System.out.println("Ile liczb chcesz wprowadziæ?");
        liczba = sc.nextInt();
        int suma = 0;
        int licznik = 0;
        while (licznik < liczba) {
            System.out.println("WprowadŸ liczbê");
            suma = sc.nextInt();
            suma += suma;
            licznik++;
        }
        System.out.println("Suma wprowadzonych liczb to " + suma);
        sc.close();
    }
}
