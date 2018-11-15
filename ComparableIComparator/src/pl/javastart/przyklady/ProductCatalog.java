package pl.javastart.przyklady;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
		products[1] = new Product("Amino", "Zupa og�rkowa", "Zupy");
		products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
		products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy b�yskawiczne");
		products[4] = new Product("WINIARY", "Ros�", "Zupy");
		products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
		products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");
		
		System.out.println("Nieposortowana: ");
		for(Product p: products) {
			System.out.println(p);
		}
		
		Arrays.sort(products);
		System.out.println("Posortowana: ");
		for(Product p: products) {
			System.out.println(p);
		}
		Arrays.sort(products, new Product.ProductNameComparator());//statyczna klasa zagnie�d�ona
		System.out.println("Posortowana dzi�ki statycznej klasie zagnie�d�onej: ");
		for(Product p: products) {
			System.out.println(p);
		}
	
	Arrays.sort(products, new Comparator<Product>() {//klasa anonimowa
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getProducer().compareTo(o2.getProducer());
		}
	});
}
}