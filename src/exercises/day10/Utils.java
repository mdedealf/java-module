package exercises.day10;

import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<String> inputUsernamePassword(Scanner scanner) {
        System.out.print("Enter username : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

        return List.of(username, password);
    }
}
