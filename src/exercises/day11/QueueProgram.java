package exercises.day11;

/**
 * Write a Java queue program that can scale dynamically
 * <p>
 * As a developer, I want to implement a Java queue program that can scale
 * dynamically using a linked list, so that I can efficiently manage data storage
 * and retrieval in my applications.
 * <p>
 * Notes:
 * The program doesn't require a menu system; focus should be on data structure implementation.
 * <p>
 * Acceptance Criteria:
 * Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
 * Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
 * Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
 * Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
 * Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
 */
public class QueueProgram<T> {
    private Node<T> front; // front node / head
    private Node<T> rear; // rear node / tail
    private int size = 0;

    // create node class to reference head & tail node for queue
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // add from the rear queue
    public void enQueue(T data) {
        // check if front is no data, set front and rear in the same element
        if(front == null) {
            rear = new Node<>(data);
            front = rear;
        } else {
            // set rear data if front already have data
            rear.next = new Node<>(data);
            rear = rear.next;
        }
        // increase dynamically size of the queue
        size++;
    }

    // returning generic data type
    public T deQueue() {
        // check queue data if empty print
        if(front == null) System.out.println("Queue is empty");

        if(front != null) {
            // get the front data
            T result = front.data;

            // change the reference of the front data to the next data
            front = front.next;
            size--;

            return result;
        }
        return null;
    }

    public T peek() {
        if(front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public void printQueue() {
        Node<T> currentNode = front;
        while(currentNode != null) {
            System.out.println(currentNode.data);

            // set currentNode to the next node
            currentNode = currentNode.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String [] args) {
        QueueProgram<Integer> queue = new QueueProgram<>();

        System.out.println("Queue size : " + queue.size());
        System.out.println("Is queue empty : " + queue.isEmpty());
        System.out.println("Peek : " + queue.peek());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.printQueue();
        System.out.println("Peek : " + queue.peek());
        System.out.println("Dequeue front data : " + queue.deQueue());
        System.out.println();
        queue.printQueue();
        System.out.println("Peek : " + queue.peek());
        System.out.println("Queue size : " + queue.size());
        System.out.println("Is queue empty : " + queue.isEmpty());
    }
}
