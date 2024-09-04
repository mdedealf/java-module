package exercises.day3;

public class SimpleCalculator {
    double n1;
    double n2;

    public SimpleCalculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double adding() {
        return n1 + n2;
    }

    public double subtracting() {
        return n1 - n2;
    }

    public double multiplying() {
        return n1 * n2;
    }

    public double dividing() {
        return n1 / n2;
    }

}
