package exercises.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketingSystem {
    private List<Event> events = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private final Scanner scanner;

    public TicketingSystem(List<Event> events, List<Ticket> tickets, Scanner scanner) {
        this.events = events;
        this.tickets = tickets;
        this.scanner = scanner;
    }

    public void createEvent() {
        // create events
        Event eventFootball = new Event("Football Match", 100000, 10000);
        Event eventRaceCar = new Event("Race Car", 125000, 2000);
        events.add(eventFootball);
        events.add(eventRaceCar);
    }

    public void showAvailableEvents() {
        int counter = 1;
        System.out.println("=================================");
        System.out.println("-------- Ongoing Events ---------");
        System.out.println("=================================");
        for (Event event : events) {
            System.out.println(counter);
            System.out.println(event.getEventName());
            System.out.println("Ticket available : " + event.getStockTicket());
            System.out.println("Price : " + event.getTicketPrice());
            System.out.println("=================================");
            counter++;
        }
    }

    public void bookingTicket(List<Event> events) {
        if(events.isEmpty()) {
            System.out.println("There is no events available.");
            return;
        }
        showAvailableEvents();

        System.out.print("Select event number that you want to book : ");
        int eventNumber = scanner.nextInt() - 1;
        scanner.nextLine(); // after using nextInt use this to consume next line

        if(eventNumber < 0 || eventNumber >= events.size()) {
            System.out.println("Invalid event number.");
            return;
        }

        Event selectedEvent = events.get(eventNumber);

        if(selectedEvent.getStockTicket() <= 0) {
            System.out.println("Ticket already sold out.");
            return;
        }

        System.out.print("Enter your name : ");
        String username = scanner.nextLine();

        Ticket createTicket = new Ticket(selectedEvent.getEventName(), selectedEvent.getTicketPrice(), username);
        tickets.add(createTicket);
        // reduce ticket stock for selected event
        selectedEvent.reduceTicketStock();

        System.out.println("Booked ticket complete!");
        createTicket.printTicketDetails();
    }
}
