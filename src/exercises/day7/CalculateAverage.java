package exercises.day7;

import java.util.Scanner;

public class CalculateAverage {
    Scanner scanner;

    public CalculateAverage(Scanner scanner) {
        this.scanner = scanner;
    }

    public double calculateAverage() {
        double average = 0;
        double sum = 0;
        int counterNumber = 0; // to count how many valid numbers are entered
        boolean isCounting = true;

        System.out.println("Enter numbers to calculate the average or enter 'q' to finish entering data : ");
        while(isCounting) {
            // read input string and remove whitespace in front and back of string
            String inputData = scanner.nextLine().trim();

            // check user input if 'q' exist exit the loop
            if(inputData.equalsIgnoreCase("q")) break;

            try {
                double numbers = Double.parseDouble(inputData);
                sum += numbers;
                counterNumber++;
            } catch (NumberFormatException e) {
                // check if failed to parsing the data
                isCounting = false;
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }

        // calculating the average if there is a valid number
        try {
            if(counterNumber > 0) average = sum / counterNumber;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
        }

        return average;
    }
}
