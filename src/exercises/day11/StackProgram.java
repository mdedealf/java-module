package exercises.day11;

import java.util.EmptyStackException;

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
public class StackProgram<T> {
    private Node<T> top; // initialize top of the stack
    private int size = 0; // set size start from 0 will be increase later automatically

    // use generic data type as a dynamic input
    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;

        // increase the size after pushing a new element
        size++;
    }

    public T pop() {
        // check if stack is empty
        if(isEmpty()) System.out.println("Stack is empty");

        T result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void printStack() {
        Node<T> current = top;

        // check if stack is empty
        if(current == null) System.out.println("Stack is empty");

        while(current != null) {
            System.out.println(current.data + " ");

            // move the current node
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args){
        StackProgram<Integer> stack = new StackProgram<>();

        System.out.println("Is empty : " + stack.isEmpty());
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println("peek : " + stack.peek());
        stack.printStack();

        System.out.println("Pop : " + stack.pop());
        System.out.println();
        stack.printStack();
        System.out.println("peek : " + stack.peek());
        System.out.println("Is empty : " + stack.isEmpty());
    }
}
