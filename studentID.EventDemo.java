package tech.alosoft;

import java.util.Random;
import java.util.Scanner;

import CarlysEventPriceWithMethods.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Event event = new Event();
        event.setEventNumber(getEventNumber());
        event.setGuest(getNumberOfGuest());
        showCompanyMotto();
        calculatePrice(event);

    }


}

class CarlysEventPriceWithMethods {
    public static String getEventNumber() {
        /*
        Generate random number from 1 to 1000 as event code
         */
        Random random = new Random();
        return String.valueOf(random.nextInt(1000));
    }


    public static int getNumberOfGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Guest attending this event: ");
        return scanner.nextInt();

    }

    public static void showCompanyMotto() {
        System.out.println("******************************************************************************");
        System.out.println("                                In God We Trust                               ");
        System.out.println("******************************************************************************");
    }

    public static void calculatePrice(Event event) {
        System.out.println("Event number: " + event.getEventNumber());
        System.out.println("Number of Guest: " + event.getGuest());
        System.out.println("Total Price: GH S" + event.getPrice());
        System.out.println("Event Type: " + (event.getGuest() > Event.cutOff ? "Large" : "Small"));
    }


}

class Event {
    public static final int pricePerGuest = 35;
    public static final int cutOff = 50;
    private String eventNumber;
    private int price;
    private int guest;

    public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
        int tempPrice = pricePerGuest * guest;
        price = tempPrice + price;
    }
}