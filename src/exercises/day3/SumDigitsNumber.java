package exercises.day3;

public class SumDigitsNumber {
    private int digitNumber;
    int sumResult = 0;

    public SumDigitsNumber(int digitNumber) {
        this.digitNumber = digitNumber;
    }

    public int sumGivenDigitsNumber() {
        // check if there are some digits numbers

        while (digitNumber != 0) {
            sumResult += digitNumber % 10;
            this.digitNumber = digitNumber / 10;
        }

        return sumResult;
    }
}
