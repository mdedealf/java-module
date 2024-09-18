package exercises.day11;

import java.util.Scanner;

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
                    System.out.println("Exit the program, see yaa later!");
                    break;
                } else System.out.println("Invalid option, please enter the valid one.");
            }
        }

        scanner.close();
    }
}
