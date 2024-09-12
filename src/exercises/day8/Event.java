package exercises.day8;

public class Event {
    private String eventName;
    private double ticketPrice;
    private int stockTicket;

    public Event(String eventName, double ticketPrice, int stockTicket) {
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
        this.stockTicket = stockTicket;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getStockTicket() {
        return stockTicket;
    }

    public void setStockTicket(int stockTicket) {
        this.stockTicket = stockTicket;
    }

    public void reduceTicketStock() {
        this.stockTicket--;
    }

    public void increaseTicketStock() {
        this.stockTicket++;
    }
}
