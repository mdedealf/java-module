package exercises.day2;

public class OddChecker {
    int n;

    public OddChecker(int n) {
        this.n = n;
    }

    public boolean isOdd() {
        return n % 2 == 0;
    }
}
