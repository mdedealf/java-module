package exercises.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private List<Event> events = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private final Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runMainMenu() {
        // create instance object of TicketingSystem class
        TicketingSystem ticketingSystem = new TicketingSystem(events,tickets,users, scanner);

        // create a user as customer
        User newUser = ticketingSystem.createUser();
        System.out.println(newUser.getName()+" "+ newUser.getCustomerId());

        // generate existed events
        ticketingSystem.createEvent();

        // always run the looping until user choose to exit the program
        while (true) {
            System.out.println("\n============ Ticketing System ============");
            System.out.println("1. Show available events");
            System.out.println("2. Booking tickets");
            System.out.println("3. Unbooked tickets");
            System.out.println("4. Show booked tickets list");
            System.out.println("5. Exit");

            // user enter a number to select menu
            System.out.print("Select menu option : ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (userChoice) {
                case 1:
                    ticketingSystem.showAvailableEvents();
                    break;
                case 2:
                    ticketingSystem.bookingTicket(events, newUser);
                    break;
                case 3:
                    ticketingSystem.unBookingTicket(events, newUser);
                case 4:
                    newUser.showBookedTickets();
                    break;
                case 5:
                    System.out.println("Exit the program, see you later!");
                    return;
                default:
                    System.out.println("Invalid input option, please input the correct one!");
            }
        }
    }
}
