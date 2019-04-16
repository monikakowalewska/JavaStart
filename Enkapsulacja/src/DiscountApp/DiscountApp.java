package DiscountApp;

import Client.Client;
import ClientService.DiscountService;
import ClientService.PrintService;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        Client client3 = new Client(null, "Kowalski",false);
        double price3 = 1200;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);
        double priceDiscount3 = discountService.calculateDiscountPrice(client3, price3);

        PrintService.info((Client) client1, price1, priceDiscount1);
        PrintService.info((Client) client2, price2, priceDiscount2);
        PrintService.info((Client) client3, price3, priceDiscount3);
    }



}
