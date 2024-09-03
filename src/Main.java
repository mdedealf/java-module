import exercises.day2.*;

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

        int n = 4;
        OddChecker oddChecker = new OddChecker(n);
        boolean isOdd = oddChecker.isOdd();
        System.out.println("is " + n + " is even number : " +isOdd);

        String words = "Hello World";
        String stringToRemove = "ell";
        RemoveString removeString = new RemoveString(words, stringToRemove);
        String result = removeString.removeTheFirstOccurrence();
        System.out.println(result);

        String word = "kodok";
        PalindromeChecker palindromeChecker = new PalindromeChecker(word);
        boolean isPalindrome = palindromeChecker.isPalindrome();

        if (isPalindrome)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}