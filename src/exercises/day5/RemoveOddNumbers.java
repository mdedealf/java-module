package exercises.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOddNumbers {

    public static int [] removeOddNumbers(int [] arrayOfNumbers) {
        // initialize ArrayList to store even numbers
        ArrayList<Integer> evenNumbersList = new ArrayList<>();

        for (int number : arrayOfNumbers) {
            if (number % 2 == 0) evenNumbersList.add(number);
        }

        // convert ArrayList into normal array
        int [] evenNumbersArray = new int[evenNumbersList.size()];
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenNumbersArray[i] = evenNumbersList.get(i);
        }
        return evenNumbersArray;
    }

    public static void runRemoveOddNumbersFromArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length : ");
        int arrayLength = scanner.nextInt();

        int [] arrayOfRandomNumbers = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            System.out.print("Enter number for element ["+i+"] : ");
            arrayOfRandomNumbers[i] = scanner.nextInt();
        }

        int [] evenNumbersArrayResult = removeOddNumbers(arrayOfRandomNumbers);
        System.out.println("After removing odd numbers from array : ");
        for (int j : evenNumbersArrayResult) {
            System.out.print(j + " ");
        }
    }
}
