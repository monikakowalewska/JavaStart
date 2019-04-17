package App;

import Data.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Podaj liczbê");
        double a=sc.nextDouble();
        sc.nextLine();
        System.out.println("Jakie dzia³anie chcesz wykonaæ? Wpisz +,-,*,/");
        String znak=sc.nextLine();
        System.out.println("Podaj drug¹ liczbê");
        double b=sc.nextDouble();
        Calculator calc=new Calculator();
        switch (znak) {
            case "+":
                calc.add(a,b);
                System.out.println("Suma liczb to "+(a+b));
                break;
            case "-":
                calc.subtract(a,b);
                System.out.println("Ró¿nica liczb to "+(a-b));
                break;
            case"*":
                calc.multiply(a,b);
                System.out.println("Iloczyn liczb to "+(a*b));
                break;
            case"/":
                calc.subtract(a,b);
                System.out.println("Iloraz liczb to "+(a/b));
                break;
            default:
                System.out.println("Nie wykonano ¿ednej operacji.");
        }
        sc.close();
    }
}
