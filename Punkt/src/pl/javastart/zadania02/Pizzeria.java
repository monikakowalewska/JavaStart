package pl.javastart.zadania02;


import java.util.Scanner;
import pl.javastart.zadania.Pizza;

public class Pizzeria {
	private Pizza pizza;
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
public static void main(String[] args) {
	int liczba=-1;
	System.out.println("Dost�pne rodzaje pizzy to: ");
	for(Pizza p: Pizza.values()) {
		System.out.println(p);
	}
/*	System.out.println("Sk�adniki kolejnych pizzy to: ");
	for(Pizza p: Pizza.values()) {
		System.out.println(p.getDescription());
	}*/
	
	System.out.println("Sk�adniki pizzy MARGHERITA");
	Pizza pizza=Pizza.MARGHERITA;
	Pizza.valueOf("MARGHERITA");
	System.out.println(Pizza.valueOf("MARGHERITA"));
	pizza.pokazSkladniki(Pizza.MARGHERITA);
	System.out.println("Sk�adniki pizzy CAPRICIOSA");
	pizza=Pizza.CAPRICIOSA;
	System.out.println(Pizza.valueOf("CAPRICIOSA"));
	pizza.pokazSkladniki(Pizza.CAPRICIOSA);
	System.out.println("Sk�adniki pizzy PROSCIUTTO");
	pizza=Pizza.PROSCIUTTO;
	/*System.out.println(Pizza.valueOf("PROSCIUTTO"));*/
	pizza.pokazSkladniki(Pizza.PROSCIUTTO);

	while(liczba!=0)
		{System.out.println("Wybierz pizz� dla siebie: ");
	System.out.println("1-Margherita, 2- Capriciosa, 3- Prosciuto,0-wyj�cie");
	Scanner odczyt=new Scanner(System.in);
	liczba=odczyt.nextInt();
	switch(liczba){
	case 1:
		System.out.println("Wybra�e� Margherit�");
		break;
	case 2:
		System.out.println("Wybra�e� Capricios�");
		break;
	case 3:
		System.out.println("Wybra�e� Prosciotto");
		break;
	case 0:
		System.out.println("Koniec");
		break;
		default:
			System.out.println("Wybra�e� niew�a�cimy numer. Spr�buj jeszcze raz.");
	}
		}
	
}

}
