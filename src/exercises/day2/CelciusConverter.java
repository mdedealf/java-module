package exercises.day2;

public class CelciusConverter {
    double fahrenheit;

    public CelciusConverter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertFahrenheitToCelcius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}
