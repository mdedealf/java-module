package exercises.day8;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String customerId;
    private List<Ticket> bookedList = new ArrayList<>();

    public User(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void bookingTicket(Ticket ticket) {
        bookedList.add(ticket);
    }

    public void unBookingTicket(Ticket ticket) {
        bookedList.remove(ticket);
    }

    public List<Ticket> getBookedTickets() {
        return bookedList;
    }

    public void showBookedTickets() {
        // check first if there is any ticket booked
        if(bookedList.isEmpty()) {
            System.out.println("No ticket booked yet.");
            return;
        }

        // if any booked, show the list
        System.out.println("Your booked tickets list : ");
        for(Ticket ticket : bookedList)
            System.out.println("Event name : "+ticket.getEventName()+" -- "+" Ticket ID : "+ticket.getTicketId());
    }
}
