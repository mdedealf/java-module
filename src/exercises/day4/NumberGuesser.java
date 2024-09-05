package exercises.day4;

import java.util.Scanner;

public class NumberGuesser {

    public void runNumberGuesser() {
        Scanner scInput = new Scanner(System.in);

        int generateARandomNumber = -1 + (int) (Math.random() * 100);
        System.out.println(generateARandomNumber);

        System.out.println("~~ Guess a number between 1 and 100 game ~~");
        int guessNumber = -1;
        int guessTryTime = 1;

        while (guessNumber != generateARandomNumber) {
            System.out.print("Guess the correct number : ");
            guessNumber = scInput.nextInt();

            if (guessNumber > generateARandomNumber) {
                System.out.println("Too High! please try again :)");
                guessTryTime++;
                continue;
            } else if (guessNumber < generateARandomNumber) {
                System.out.println("Too Low! please try again :(");
                guessTryTime++;
                continue;
            } else {
                System.out.println("You guess the Correct! number");
                System.out.println("You have tried for " + guessTryTime + " times.");
            }
        }
    }
}
