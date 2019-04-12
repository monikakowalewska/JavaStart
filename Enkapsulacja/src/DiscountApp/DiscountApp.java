package DiscountApp;

import Client.Client;
import ClientService.DiscountService;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        info((Client) client1, price1, priceDiscount1);

        info((Client) client2, price2, priceDiscount2);
    }

    private static void info(Client client1, double price1, double priceDiscount1) {
        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price1);
        System.out.println("Do zap³aty (po rabacie): " + priceDiscount1);
    }

}
