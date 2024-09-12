package exercises.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketingSystem {
    private List<Event> events = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private final Scanner scanner;

    public TicketingSystem(List<Event> events, List<Ticket> tickets, List<User> users, Scanner scanner) {
        this.events = events;
        this.tickets = tickets;
        this.users = users;
        this.scanner = scanner;
    }

    public void createEvent() {
        // create events
        Event eventFootball = new Event("Football Match", 100000, 10000);
        Event eventRaceCar = new Event("Race Car", 125000, 2000);
        events.add(eventFootball);
        events.add(eventRaceCar);
    }

    public User createUser() {
        System.out.print("Enter your name : ");
        String userName = scanner.nextLine();
        User user = new User(userName, Utils.generateUserUuid());
        users.add(user);
        return user;
    }

    public void showAvailableEvents() {
        int counter = 1;
        System.out.println("------------ Ongoing Events -------------");
        for (Event event : events) {
            System.out.println(counter+ ". "+event.getEventName()+" -- "+"Ticket available: " + event.getStockTicket()+" -- "+"Price: " + event.getTicketPrice());
            counter++;
        }
    }

    public void bookingTicket(List<Event> events, User user) {
        // check if there is any event ongoing
        if(events.isEmpty()) {
            System.out.println("There is no events available.");
            return;
        }
        // if there is any, show the available events
        showAvailableEvents();

        // user enter displayed number to choose an event
        System.out.print("\nSelect event number that you want to book : ");
        // eventNumber - 1 because array index started at 0 so if user choose event no 2 it should be 1 in an array
        int eventNumber = scanner.nextInt() - 1;
        scanner.nextLine(); // after using nextInt use this to consume next line

        // check if user entered a number
        // TODO: create user input checking

        // check if eventNumber that user entered isn't match
        if(eventNumber < 0 || eventNumber >= events.size()) {
            System.out.println("Invalid event number.");
            return;
        }

        // get the selected event
        Event selectedEvent = events.get(eventNumber);
        // get current user
        User currentUser = users.getFirst();
        // check if selected event still have any ticket available
        if(selectedEvent.getStockTicket() <= 0) {
            System.out.println("Ticket already sold out.");
            return;
        }

        Ticket createTicket = new Ticket(selectedEvent.getEventName(), selectedEvent.getTicketPrice(), currentUser.getName());
        tickets.add(createTicket);
        user.bookingTicket(createTicket);
        // reduce ticket stock for selected event
        selectedEvent.reduceTicketStock();

        System.out.println("Booked ticket complete!");
        createTicket.printTicketDetails();
    }

    public void unBookingTicket(List<Event> events, User user) {
        List<Ticket> userTickets = user.getBookedTickets();

        // check if any booked ticket
        if(userTickets.isEmpty()) {
            System.out.println("You haven't book any ticket");
            return;
        }

        System.out.println("====== Your booked tickets ======");
        for(int i = 0; i < userTickets.size(); i++) {
            Ticket ticket = userTickets.get(i);
            System.out.println((i +1) +". Event name : "+ticket.getEventName()+ " -- Ticket ID : " +ticket.getTicketId());
        }

        System.out.print("Select a number to unbook: ");
        int unbookTicketIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        // check if entered number valid
        if(unbookTicketIdx < 0 || unbookTicketIdx >= userTickets.size()) {
            System.out.println("Please enter valid number");
            return;
        }

        Ticket unbookedTicket = userTickets.get(unbookTicketIdx);
        tickets.remove(unbookedTicket);
        user.unBookingTicket(unbookedTicket);
        for(Event event : events) {
            if(event.getEventName().equals(unbookedTicket.getEventName())) {
                event.increaseTicketStock();
                break;
            }
        }
        System.out.println("Successfully unbooked ticket!");
    }
}
