package exercises.day8;

import java.sql.SQLOutput;

public class Ticket implements Ticketable{
    private String ticketId;
    private String eventName;
    private double price;
    private String username;

    public Ticket(String eventName, double price, String username) {
        this.ticketId = Utils.generateTicketUuid();
        this.eventName = eventName;
        this.price = price;
        this.username = username;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("\n===========================");
        System.out.println("Ticket Booking detail : ");
        System.out.println("Ticket Id : " + ticketId);
        System.out.println("Event Name : " + eventName);
        System.out.println("Price : " + price);
        System.out.println("Name : " + username);
        System.out.println("===========================");
    }
}
