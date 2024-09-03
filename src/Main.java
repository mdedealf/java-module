import exercises.day2.CelciusConverter;
import exercises.day2.KilometersConverter;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 120;
        CelciusConverter celciusConvert = new CelciusConverter(fahrenheit);
        double celcius = celciusConvert.convertFahrenheitToCelcius();
        System.out.println(fahrenheit + " Fahrenheit to Celcius is : " + celcius + " °C");

        double centimeter = 100000;
        KilometersConverter centiToKilometers = new KilometersConverter(centimeter);
        double kilometers = centiToKilometers.convertCentimeterToKilometers();
        System.out.println(centimeter + " cm to Kilometers is " + kilometers + " km");
    }
}