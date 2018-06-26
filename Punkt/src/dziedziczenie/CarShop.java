package dziedziczenie;

public class CarShop {
	public static void main(String[] args) {
        Car audi = new Car(2014, "Audi", "A5", "Czarne");
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";
		
        Car audiA4 = new Car(2014, "Audi", "A4");
        
        System.out.println("Rocznik: " + audiA4.getYear()); //2014
        //zmieniamy rocznik
        audiA4.setYear(2015);
        System.out.println("Rocznik: " + audiA4.getYear()); //2015
        //próbujemy znowu przestawiæ
        audiA4.setYear(-500); //komunikat w konsoli
        System.out.println("Rocznik: " + audiA4.getYear()); //2015

 
        String audiInfo = audi.brand + " " + audi.model
                        + ", Drzwi: " + audi.doors
                        + ", Kolor nadwozia: " + audi.carColor
                        + ", Kolor felg: " + audi.wheelsColor 
                        + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybra³eœ nastêpuj¹cy samochód: ");
        System.out.println(audiInfo);
    }
}
