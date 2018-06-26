package pl.javastart.przyklady03;

import pl.javastart.przyklady.Size;
import pl.javastart.przyklady02.Tshirt;

public class ShirtShop {
	public static void main(String[] args) {
		System.out.println("Dostêpne rozmiary tshirtów: ");
		for(Size s: Size.values()) {
			System.out.println(s.getDescription());
		}

		Tshirt tshirt = new Tshirt();
		tshirt.setSize(Size.MEDIUM);
		System.out.println(tshirt.getSize());
		System.out.println(tshirt.getSize().getDescription());
		
		System.out.println("Wybierz rozmiar koszulki: ");
		tshirt.setSize(Size.valueOf("MEDIUM"));
		System.out.println("Wybra³eœ tshirt w rozmiarze: " + tshirt.getSize().getDescription());
		
		System.out.println("Wybierz rozmiar koszulki: ");
		Size tshirtSize = sizeFromDescription("Ma³y");
		tshirt.setSize(tshirtSize);
		System.out.println("Wybra³eœ tshirt w rozmiarze: " + tshirt.getSize().getDescription());


	}
	static Size sizeFromDescription(String desc) {
		for(Size s: Size.values()) {
			if(s.getDescription().equals(desc))
				return s;
		}
		return Size.MEDIUM;
	}
}
