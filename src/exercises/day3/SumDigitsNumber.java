package exercises.day3;

public class SumDigitsNumber {
    private int digitNumber;
    int sumResult = 0;

    public SumDigitsNumber(int digitNumber) {
        this.digitNumber = digitNumber;
    }

    public int sumGivenDigitsNumber() {
        // Get last digit : use modulo (digitNumber % 10)
        // Remove last digit : use integer division (digitNumber = digitNumber / 10)

        // Digit calculation : add the last digit to the sum, until all the digits have summed
        while (digitNumber != 0) {
            sumResult += digitNumber % 10;
            this.digitNumber = digitNumber / 10;
        }

        return sumResult;
    }
}
