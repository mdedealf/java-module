package exercises.day11;

import java.util.Scanner;

public class BinarySearch {

    private static int BinarySearchTree(int [] data, int search) {
        int low = 0;
        int high = data.length - 1;

        while(low <= high) {
            int middlePosition = (low + high) / 2;
            int middleValue = data[middlePosition];

            // if number to find is equal with middle value index
            if(search == middleValue) return middlePosition;

            // if number to find is less than middle value
            if(search < middleValue) high = middlePosition - 1; // set to the left number
            else low = middlePosition + 1; // if number to find is greater than middle value
        }
        return -1;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the data : ");
        int sizeData = scanner.nextInt();
        scanner.nextLine(); // consume the next line (avoiding error)

        int [] data = new int[sizeData];

        for(int i = 0; i < data.length ; i++) {
            System.out.print("Enter data element ["+i+"] : ");
            data[i] = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.print("\nEnter the number to search : ");
        int searchData = scanner.nextInt();
        int result = BinarySearchTree(data, searchData);

        if(result == -1) System.out.println("Number not found");
        else System.out.println("Number found at index " + result);

        scanner.close();
    }
}
