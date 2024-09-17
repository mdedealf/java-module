package exercises.day11;

/**
 * Write a Java stack program that can scale dynamically
 * <p>
 * As a developer, I want to implement a Java stack program that can scale dynamically
 * using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
 * Notes:
 * The program doesn't require a menu system; focus should be on data structure implementation.
 * Acceptance Criteria:
 * <p>
 * Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
 * Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
 * Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
 * Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
 * Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
 */
public class StackProgram {
    private Node head;

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Delete by key
    public void deleteByKey(int key) {
        Node current = head, prev = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Size of the list
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // String representation of the list
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StackProgram sp = new StackProgram();
    }
}
