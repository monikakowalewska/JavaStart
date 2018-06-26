package pl.javastart.zadania;
import java.util.Random;

public class OperacjeNaZmiennych {
public static void main(String[] args) {
       Random rand = new Random();
       int number1 = rand.nextInt(10); // losowa liczba z przedzia³u [0, 9], 10 siê nie wlicza
       int number2 = new Random().nextInt(10); // krótsza wersja
       int x=number1;
       int y=number2;
       
       System.out.println(x);
       System.out.println(y);
       System.out.println("Czy x jest wiêksze od y?");
       boolean result=true;
       result=(x>y);
       System.out.println(result);
       System.out.println("Czy x pomno¿one przez 2 jest wiêksze od y?");
       result=(2*x)>y;
       System.out.println(result);
       System.out.println("Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?");
       result=y<(x+3)&&y>(x-2);
       System.out.println(result);
       System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacjê modulo)");
       result=(0==(( x* y) % 2));
       System.out.println(result);
       
   }
}

