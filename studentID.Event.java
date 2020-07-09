
public class Event {
    public static final int pricePerGuest = 35;
    public static final int cutOff = 50;
    private String eventNumber;
    private int price;
    private int guest;

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuest(int guest) {
        this.guest = guest;
        int tempPrice = pricePerGuest * guest;
        price = tempPrice + price;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getGuest() {
        return guest;
    }
}
