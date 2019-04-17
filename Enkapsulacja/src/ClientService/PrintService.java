package ClientService;

import Client.Client;

public class PrintService {
    public static void info(Client client, double price, double priceDiscount) {
        System.out.println(client.printClient());
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zap³aty (po rabacie): " + priceDiscount);
    }

}
