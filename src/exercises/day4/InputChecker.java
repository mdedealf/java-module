package exercises.day4;

import java.util.Scanner;

public class InputChecker {

    public static void runInputChecker() {
        Scanner sc = new Scanner(System.in);
        String inputRandom;

        do {
            System.out.print("Enter a random number : ");
            inputRandom = sc.next();

            System.out.print("Press y to continue, press n to stop? (y/n) : ");
            inputRandom = sc.next();

            // validate the user input
            while(!inputRandom.equalsIgnoreCase("y") && !inputRandom.equalsIgnoreCase("n")) {
                System.out.print("You input the wrong choice. Enter y to continue, press n to stop (y/n): ");
                inputRandom = String.valueOf(sc.next());
            }
        } while (inputRandom.equalsIgnoreCase("y"));

        System.out.println("You pressed 'n', see yaa later!");

        sc.close();
    }
}
