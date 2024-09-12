package exercises.day9;

import java.util.List;
import java.util.Scanner;

public class Utility {

    public static List<String> loginRegisterInput(Scanner scanner) {
        System.out.print("Enter username : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

        return List.of(username, password);
    }
}
