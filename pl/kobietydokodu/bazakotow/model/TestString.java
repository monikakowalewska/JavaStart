package pl.kobietydokodu.bazakotow.model;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestString {
	/*=============polimorfizm============*/
	public static void main(String[] args){
		String str1 = new String("Siabada1");
        Object str2 = new String("Siabada2");
        System.out.println(str1);
        System.out.println(str2);
        /*==============try catch w scanner============*/
	/*int tab[] = {1,2,3,4,5};
    Scanner odczyt = new Scanner(System.in);
    int index = -1;

    System.out.println("Podaj indeks tablicy, który chcesz zobaczyæ: ");
    index = odczyt.nextInt();

    try {
        System.out.println(tab[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
    }*/
        /*============try catch w BufferedReader=========*/
 /*   int tab[] = {1,2,3,4,5};
    BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
    int index = -1;

    System.out.println("Który element tablicy chcesz zobaczyæ: ");
    boolean czyPoprawne = false;

    while(!czyPoprawne) {
        try {
        index = Integer.parseInt(odczyt.readLine());
        } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
              "\n Który element tablicy chcesz zobaczyæ: ");
        } catch (IOException e) { System.out.println("B³¹d odczytu danych");
        }

        czyPoprawne = index == -1? false : true;
    }

    try {
        System.out.println(tab[index-1]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
    }
    
}*/
        /*===========instrukcja throw=======*/
/*	public static void main(String[] agrs) throws ArithmeticException{
        int x=10;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj dzielnik: ");
        y = sc.nextInt();
        if(y==0)
            throw new ArithmeticException("Nie mozna dzieliæ przez 0");
        else
            System.out.println(x/(double)y);*/
   }
}
