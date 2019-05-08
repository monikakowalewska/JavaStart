package Zadania;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int x=0;
        int suma=0;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Podaj liczbê ca³kowit¹");
            x=sc.nextInt();
            suma=+x;

        }
        while(x<100);


        if(suma%2==0){
            System.out.println("Parzysta");
        }else{
            System.out.println("Nieparzysta");
        }
    }
}
