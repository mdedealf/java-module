package exercises.day11;

import java.util.Scanner;

/**
 * Write a Java binary search tree program that can scale dynamically
 * <p>
 * As a user, I want to insert N-numbers into a binary search tree and then
 * search for a specific number. After searching, the program should prompt me to
 * search for another number without terminating.
 * <p>
 * Acceptance Criteria:
 * The program should start by prompting the user to enter the number of
 * elements (N) they wish to insert into the binary search tree.
 * The program should then prompt the user to enter N numbers one by one.
 * <p>
 * Acceptance Criteria:
 * The program should correctly insert each number into the binary search tree in a way that maintains the binary search tree properties (all nodes in the left subtree are less than the root, and all nodes in the right subtree are greater than the root).
 * The program should handle duplicate numbers appropriately, either by ignoring them or by updating the existing node.
 * After inserting all N-numbers, the program should prompt the user to enter a number to search for within the binary search tree.
 * The program should perform a binary search to find the entered number, following the binary search tree properties.
 * The program should display whether the number is found or not.
 * The program should provide a clear and straightforward way for the user to exit the continuous search loop and terminate the program, such as entering a specific keyword or command.
 */
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
