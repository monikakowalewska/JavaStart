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
	System.out.println("Dostêpne rodzaje pizzy to: ");
	for(Pizza p: Pizza.values()) {
		System.out.println(p);
	}
/*	System.out.println("Sk³adniki kolejnych pizzy to: ");
	for(Pizza p: Pizza.values()) {
		System.out.println(p.getDescription());
	}*/
	
	System.out.println("Sk³adniki pizzy MARGHERITA");
	Pizza pizza=Pizza.MARGHERITA;
	Pizza.valueOf("MARGHERITA");
	System.out.println(Pizza.valueOf("MARGHERITA"));
	pizza.pokazSkladniki(Pizza.MARGHERITA);
	System.out.println("Sk³adniki pizzy CAPRICIOSA");
	pizza=Pizza.CAPRICIOSA;
	System.out.println(Pizza.valueOf("CAPRICIOSA"));
	pizza.pokazSkladniki(Pizza.CAPRICIOSA);
	System.out.println("Sk³adniki pizzy PROSCIUTTO");
	pizza=Pizza.PROSCIUTTO;
	/*System.out.println(Pizza.valueOf("PROSCIUTTO"));*/
	pizza.pokazSkladniki(Pizza.PROSCIUTTO);

	while(liczba!=0)
		{System.out.println("Wybierz pizzê dla siebie: ");
	System.out.println("1-Margherita, 2- Capriciosa, 3- Prosciuto,0-wyjœcie");
	Scanner odczyt=new Scanner(System.in);
	liczba=odczyt.nextInt();
	switch(liczba){
	case 1:
		System.out.println("Wybra³eœ Margheritê");
		break;
	case 2:
		System.out.println("Wybra³eœ Capriciosê");
		break;
	case 3:
		System.out.println("Wybra³eœ Prosciotto");
		break;
	case 0:
		System.out.println("Koniec");
		break;
		default:
			System.out.println("Wybra³eœ niew³aœcimy numer. Spróbuj jeszcze raz.");
	}
		}
	
}

}
