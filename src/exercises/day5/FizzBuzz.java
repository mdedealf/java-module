package exercises.day5;

import java.util.Scanner;

public class FizzBuzz {
    int numberToSolve;

    public FizzBuzz(int numberToSolve) {
        this.numberToSolve = numberToSolve;
    }

    public static void runFizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nInput Number to solve : ");
        int numberToSolve = scanner.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz(numberToSolve);

        // For loop to check through the numbers that given
        for (int i = 1; i <= numberToSolve; i++) {
            // Check if can divided by 3 and 5 print FizzBuzz
            if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");

            // check if can divided by 3
            else if(i % 3 == 0) System.out.println("Fizz");

            // Check if can divided by 5
            else if(i % 5 == 0) System.out.println("Buzz");

            // if there are none just print the current number
            else System.out.println(i);
        }
    }
}
