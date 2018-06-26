package dziedziczenie;

public class Car {
	int doors;
	private int year;
    String carColor;
    String wheelsColor;
    String tiresColor;
    String brand;
    String model;
    String color;
    
    public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }
 
    // konstruktor2
    Car(int year, String brand, String model) {
        this.setYear(year);
        this.brand = brand;
        this.model = model;
    }

	
}
