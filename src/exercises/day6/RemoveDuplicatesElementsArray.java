package exercises.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesElementsArray {
    private final int [] array;
    private final Scanner scanner;

    public RemoveDuplicatesElementsArray(int [] array, Scanner scanner) {
        this.array = Arrays.copyOf(array, array.length);
        this.scanner = scanner;
    }

    private int [] removeDuplicatesElements() {
        int arrayLength = this.array.length;

        // initialize a temporary array to store elements
        int [] tempArray = new int[arrayLength];
        // Initialize temporary index for the next index element
        int tempIndex = 0;

        if (arrayLength == 1 || arrayLength == 0) {
            System.out.println("\n\nThere is no duplicate elements in the array");
            return this.array;
        }

        for(int i = 0; i < arrayLength; i++) {
            // declare a boolean variable to check status is duplicate
            boolean isElementDuplicate = false;

            // check if array[i] already in temporary array
            for(int j = 0; j < tempIndex; j++) {
                if(array[i] == tempArray[j]) {
                    isElementDuplicate = true;
                    break;
                }
            }

            // check if its not duplicate store to temporary array
            if(!isElementDuplicate) {
                tempArray[tempIndex] = array[i];
                tempIndex++;
            }
        }

        // store into new int array with no duplicates elements
        int [] noDuplicatesArray = new int [tempIndex];
        for(int i = 0; i < tempIndex; i++) noDuplicatesArray[i] = tempArray[i];

        return noDuplicatesArray;
    }

    public void runRemoveDuplicatesElements() {
        int [] noDuplicatesArray = removeDuplicatesElements();

        System.out.println("Input array : ");
        for(int i : this.array) System.out.print(i + " ");
        System.out.println();

        System.out.print("Select what the order do you want to print the array (asc / desc) : ");
        String orderData = scanner.nextLine();

        if(orderData.equals("asc")) {
            // Sorting the array values order by ascending using bubble sort
            BubbleSorting.bubbleSortAscending(noDuplicatesArray);
            for(int i : noDuplicatesArray) System.out.print(i + " ");
        } else if(orderData.equals("desc")) {
            // Sorting the array values order by ascending using bubble sort
            BubbleSorting.bubbleSortDescending(noDuplicatesArray);
            for(int i : noDuplicatesArray) System.out.print(i + " ");
        } else {
            System.out.println("Please enter the correct order!");
        }
    }
}
