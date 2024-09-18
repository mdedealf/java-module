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
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public static class TreeNode {
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Recursive method to insert a new node
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // if data == root.data, ignore duplicates data
        return root;
    }

    // Recursive method to search a key
    private boolean searchRec(TreeNode root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        if (data < root.data) return searchRec(root.left, data);

        return searchRec(root.right, data);
    }

    private void printInOrder() {
        printTree(root);
    }

    private void printTree(TreeNode root) {
        if (root != null) {
            // traverse left subtree
            printTree(root.left);

            // visit the root node
            System.out.print(root.data + " ");

            // traverse right subtree
            printTree(root.right);
        }
    }

    // search for a given key in the BST
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // insert new data
    public void insert(int data) {
        root = insertRec(root, data);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        System.out.print("Enter the size of the data : ");
        int sizeData = scanner.nextInt();
        scanner.nextLine(); // consume the next line (avoiding error)

        for(int i = 0; i < sizeData; i++) {
            System.out.print("Enter data element ["+i+"] : ");
           int number = scanner.nextInt();
           tree.insert(number);
        }

        tree.printInOrder();
        System.out.println();

        // perform continuous search
        while (true) {
            System.out.print("Enter a number to search or type ('q') to exit : ");

            // check if input int
            if(scanner.hasNextInt()) {
                int numberToSearch = scanner.nextInt();

                if(tree.search(numberToSearch)) System.out.println(numberToSearch + " found in the tree.");
                else System.out.println("Number is not found in the tree.");
            } else {
                String option = scanner.nextLine();
                if(option.equalsIgnoreCase("q")) {
                    System.out.println("\nExit the program, see yaa later!");
                    break;
                } else System.out.println("\nInvalid option, please enter the valid one.");
            }
        }

        scanner.close();
    }
}
