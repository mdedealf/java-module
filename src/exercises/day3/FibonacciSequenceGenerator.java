package exercises.day3;

public class FibonacciSequenceGenerator {
    int numberSequence;

    public FibonacciSequenceGenerator(int numberSequence) {
        this.numberSequence = numberSequence;
    }

    public void fibonacciSequence() {
        // Define first and second variable value
        int first = 0;
        int second = 1;

        // check if given number less than 1
        if (numberSequence <= 0) {
            System.out.println("Input a positive number!");
            return; // terminate the rest of code block
        }

        // print fibonacci first terms (number >= 1)
        if (numberSequence >= 1) System.out.print(first + " ");

        // print fibonacci second terms (number > 1)
        if (numberSequence >= 2) System.out.print(second + " ");

        // print the remaining fibonacci terms
        // iteration start from 3 because the first two number already generated
        for(int i = 3; i <= numberSequence; i++) {
            // initialize variable to generate next number
            int nextNumber = first + second;
            System.out.print(nextNumber + " ");
            first = second;
            second = nextNumber;
        }
    }
}
