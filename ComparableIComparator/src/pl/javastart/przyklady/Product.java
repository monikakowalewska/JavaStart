package pl.javastart.przyklady;

import java.util.Comparator;

public class Product implements Comparable<Product>{
	private String producer;
	private String name;
	private String category;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(String producer, String name, String category) {
		setProducer(producer);
		setCategory(category);
		setName(name);
	}

	@Override
	public String toString() {
		return "Product [category=" + category + ", producer=" + producer + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Product p) {
		int categoryCompare = category.compareTo(p.getCategory());
		if(categoryCompare != 0) {
			return categoryCompare;
		}
		int producerCompare = producer.compareTo(p.getProducer());
		if(producerCompare != 0) {
			return producerCompare;
		}
		return name.compareTo(p.getName());
	}
	public static class ProductNameComparator implements Comparator<Product> {//statyczna klasa zagnie�d�ona
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getName().compareTo(p2.getName());
		}
	}

}
