package exercises.day2;

public class KilometersConverter {
    double centimeter;

    public KilometersConverter(double centimeter) {
        this.centimeter = centimeter;
    }

    public double convertCentimeterToKilometers() {
        return centimeter / 1000;
    }
}
