package exercises.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private List<Event> events = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private final Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runMainMenu() {
        TicketingSystem ticketingSystem = new TicketingSystem(events,tickets, scanner);

        while (true) {
            System.out.println("\n======== Ticketing System ========");
            System.out.println("1. Show available events");
            System.out.println("2. Booking tickets");
            System.out.println("3. Exit");
            System.out.print("Select menu option : ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (userChoice) {
                case 1:
                    ticketingSystem.createEvent();
                    ticketingSystem.showAvailableEvents();
                    break;
                case 2:
                    ticketingSystem.bookingTicket(events);
                    break;
                case 3:
                    System.out.println("Exit the program, see you later!");
                    return;
                default:
                    System.out.println("Invalid input option, please input the correct one!");
            }
        }
    }
}
