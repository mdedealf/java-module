import exercises.day2.*;
import exercises.day3.FindLargestElementInArray;
import exercises.day3.PrimeNumberChecker;
import exercises.day3.SumDigitsNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXERCISE DAY 2

        // No. 1
//        System.out.print("Input the temperature in Fahrenheit : ");
//        double fahrenheit = sc.nextDouble();
//        CelciusConverter celciusConvert = new CelciusConverter(fahrenheit);
//        double celcius = celciusConvert.convertFahrenheitToCelcius();
//        System.out.println(fahrenheit + " Fahrenheit to Celcius is : " + celcius + " °C\n");

        // No. 2
//        System.out.print("Input the length in centimeter : ");
//        double centimeter = sc.nextDouble();
//        KilometersConverter centiToKilometers = new KilometersConverter(centimeter);
//        double kilometers = centiToKilometers.convertCentimeterToKilometers();
//        System.out.println(centimeter + " cm to Kilometers is " + kilometers + " km\n");

        // No. 3
//        System.out.print("Input the number to check : ");
//        int n = sc.nextInt();
//        sc.nextLine();
//        OddChecker oddChecker = new OddChecker(n);
//        boolean isOdd = oddChecker.isOdd();
//        System.out.println("is " + n + " even number : " + isOdd + "\n");

        // No. 4
//        System.out.print("Input the original words : ");
//        String words = sc.nextLine();
//
//        System.out.print("Input word or character to remove : ");
//        String stringToRemove = sc.nextLine();
//
//        RemoveString removeString = new RemoveString(words, stringToRemove);
//        System.out.println(removeString.removeTheFirstOccurrence() + "\n");

        // No. 5
//        System.out.print("Input word to check if palindrome : ");
//        String word = sc.nextLine();
//        PalindromeChecker palindromeChecker = new PalindromeChecker(word);
//        boolean isPalindrome = palindromeChecker.isPalindrome();
//
//        if (isPalindrome)
//            System.out.println(word + " is a palindrome");
//        else
//            System.out.println(word + " is not a palindrome");


        // EXERCISE DAY 3

        // No. 1
        System.out.print("Input some digits number : ");
        int givenDigitsNumber = sc.nextInt();
        SumDigitsNumber countGivenDigits = new SumDigitsNumber(givenDigitsNumber);
        int result = countGivenDigits.sumGivenDigitsNumber();
        System.out.println("Result from given digits " + givenDigitsNumber + " : " + result + "\n");

        // No. 2
        System.out.print("Input number to check if prime : ");
        int givenNumber = sc.nextInt();
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(givenNumber);
        System.out.println("Is " + givenNumber + " prime number : " + primeNumberChecker.isPrimeNumber()+ "\n");

        // No. 3
        System.out.print("Input element size of an array : ");
        int elementSize = sc.nextInt();

        // initialize array with custom element size
        int [] arrayNumber = new int[elementSize];

        // using for loop to input arrayNumber element 1 by 1
        for (int i = 0; i < elementSize; i++) {
            System.out.print("Input array element["+i+"] : ");
            arrayNumber[i] = sc.nextInt();
        }
        FindLargestElementInArray findLargest = new FindLargestElementInArray(arrayNumber);
        int largestNumber = findLargest.findLargestElementArray();
        System.out.println("\nThe largest element number from that array : " + largestNumber);

        sc.close();
    }
}