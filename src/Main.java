import exercises.day2.CelciusConverter;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 120;
        CelciusConverter celciusConvert = new CelciusConverter(fahrenheit);
        double celcius = celciusConvert.convertFahrenheitToCelcius();
        System.out.println(fahrenheit + " Fahrenheit to Celcius is : " + celcius + " °C");
    }
}