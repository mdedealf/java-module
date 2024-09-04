package exercises.day3;

public class PrimeNumberChecker {
    boolean isPrime = false;
    int primeNumber;

    public PrimeNumberChecker(int primeNumber) {
        this.primeNumber = primeNumber;
    }

    public boolean isPrimeNumber() {
        // check if number <=1
        if (primeNumber <= 1) return false;

        // checking the number divisibility using Math.sqrt square root
        for(int i = 2; i <= Math.sqrt(primeNumber); i++) {
            // check if equal to 0 return false / non prime
            if (primeNumber % i == 0) return false;
        }

        // return true (prime number) if no divisor founded

        return true;
    }
}
