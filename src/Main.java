import exercises.day6.ArrayRotation;
import exercises.day6.CheckDuplicatesArrayValues;
import exercises.day6.RemoveDuplicatesElementsArray;
import exercises.day6.ReverseTheString;

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
//        System.out.print("Input some digits number : ");
//        int givenDigitsNumber = sc.nextInt();
//        SumDigitsNumber countGivenDigits = new SumDigitsNumber(givenDigitsNumber);
//        int result = countGivenDigits.sumGivenDigitsNumber();
//        System.out.println("Result from given digits " + givenDigitsNumber + " : " + result + "\n");

        // No. 2
//        System.out.print("Input number to check if prime : ");
//        int givenNumber = sc.nextInt();
//        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker(givenNumber);
//        System.out.println("Is " + givenNumber + " prime number : " + primeNumberChecker.isPrimeNumber()+ "\n");

        // No. 3
//        System.out.print("Input element size of an array : ");
//        int elementSizeArray = sc.nextInt();

        // initialize array with custom element size
//        int [] arrayNumber = new int[elementSizeArray];

        // using for loop to input arrayNumber element 1 by 1
//        for (int i = 0; i < elementSizeArray; i++) {
//            System.out.print("Input array element["+i+"] : ");
//            arrayNumber[i] = sc.nextInt();
//        }
//        FindLargestElementInArray findLargest = new FindLargestElementInArray(arrayNumber);
//        int largestNumber = findLargest.findLargestElementArray();
//        System.out.println("The largest element number from that array : " + largestNumber + "\n");

        // No. 4
//        System.out.print("1 Adding \n2 Substracting \n3 Multiplying \n4 Dividing \nType the menu number to do What you want : ");
//        int menuNumber = sc.nextInt();
//
//        System.out.print("Input first number : ");
//        double n1 = sc.nextDouble();
//        System.out.print("Input second number : ");
//        double n2 = sc.nextDouble();
//        SimpleCalculator simpleCalculator = new SimpleCalculator(n1, n2);
//
//        var calcResult = switch (menuNumber) {
//            case 1 -> simpleCalculator.adding();
//            case 2 -> simpleCalculator.subtracting();
//            case 3 -> simpleCalculator.multiplying();
//            case 4 -> simpleCalculator.dividing();
//            default -> throw new IllegalStateException("Unexpected value: " + menuNumber);
//        };
//        System.out.println("Result : " +calcResult+ "\n");

        // No. 5
//        sc.nextLine();
//        System.out.print("Input String to reversed : ");
//        String word = sc.nextLine();
//        ReverseString reverseString = new ReverseString(word);
//        System.out.println("\nReversed result : " + reverseString.reverseString()+ "\n");

        // No. 6
//        System.out.print("Input a positive number to generate fibonnaci sequence : ");
//        int numberSequence = sc.nextInt();
//        FibonacciSequenceGenerator fiboGenerator = new FibonacciSequenceGenerator(numberSequence);
//        fiboGenerator.fibonacciSequence();

        // No. 7
//        sc.nextLine();
//        System.out.print("\n\nInput a word to check vowels number : ");
//        String vowelsWord = sc.nextLine().toLowerCase();
//        CountVowelsNumber countVowels = new CountVowelsNumber(vowelsWord);
//        int countedVowels = countVowels.countVowelsNumber();
//        System.out.println("Vowels counter from ("+ vowelsWord + ") : " + countedVowels +"\n");

        // No. 8
//        int [] randomNumbers = {64, 34, 25, 12, 22, 11, 90};
//        System.out.println("Before using Bubble sort : ");
//        BubbleSort.printArray(randomNumbers);
//        System.out.println("\nAfter using Bubble sort : ");
//        BubbleSort.bubbleSort(randomNumbers);
//        BubbleSort.printArray(randomNumbers);

        // No. 9
//        System.out.println("\n\nAnagrams checker");
//        System.out.print("Input first word : ");
//        String firstWord = sc.nextLine().toLowerCase();
//        System.out.print("Input second word : ");
//        String secondWord = sc.nextLine().toLowerCase();
//        AnagramChecker anagramChecker = new AnagramChecker(firstWord, secondWord);
//        boolean isAnagram = anagramChecker.isTwoWordsAnagram();
//        System.out.println("Are two words anagrams : " + isAnagram+ "\n");

        // No. 10
//        System.out.print("Input element size of an array : ");
//        int arrSizeElement = sc.nextInt();

        // initialize array with custom element size
//        int [] arrNumber = new int[arrSizeElement];

        // using for loop to input arrayNumber element 1 by 1
//        for (int i = 0; i < arrSizeElement; i++) {
//            System.out.print("Input array element["+i+"] : ");
//            arrNumber[i] = sc.nextInt();
//        }
//        FindTheSmallestNumber findTheSmallest = new FindTheSmallestNumber(arrNumber);
//        int smallestNumber = findTheSmallest.findSmallestElementNumber();
//        System.out.print("The smallest number from that array : " + smallestNumber + "\n");

        // EXERCISE DAY 4

        // No. 1
//        System.out.print("Input a number to create multiplication table : ");
//        int inputNumber = sc.nextInt();
//        PrintMultiplicationTable printMultiplication = new PrintMultiplicationTable(inputNumber);
//        printMultiplication.printMultiplicationTable();

        // No. 2
//        System.out.print("\nInput a number to create star pattern table : ");
//        int inputStarPatternNumber = sc.nextInt();
//        PrintStarPattern printStarPattern = new PrintStarPattern(inputStarPatternNumber);
//        printStarPattern.printStar();

        // No. 3
//        System.out.println();
//        InputChecker.runInputChecker();

        // No. 4
//        System.out.println();
//        NumberGuesser numberGuesser = new NumberGuesser();
//        numberGuesser.runNumberGuesser();

        // No. 5
//        System.out.println();
//        UpperAndLowerCaseSwap upperAndLowerCaseSwap = new UpperAndLowerCaseSwap();
//        String resultAfterSwapped = upperAndLowerCaseSwap.upperAndLowerCaseSwapper();
//        System.out.println("Result : " + resultAfterSwapped);

        // EXERCISE DAY 5

        // No. 1
//        WordGuessingGame wordGuessingGame = new WordGuessingGame();
//        wordGuessingGame.runWordGuessingGame();

        // No. 2
//        CurrencyConverter.runCurrencyConverter();

        // No. 3
//        RemoveOddNumbers.runRemoveOddNumbersFromArray();

        // No. 4
//        FizzBuzz.runFizzBuzz();

        // No. 5
//        CheckPairsOfNumbers.runFindTwoSumOfNumber();

        // EXERCISE DAY 6

        // No. 1
        int dimension = 6;
        int [] arrayOfNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayRotation arrayRotation = new ArrayRotation(dimension, arrayOfNumber);
        arrayRotation.runRotateArray();

        // No. 2
        int [] arrayToCheck = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        CheckDuplicatesArrayValues checkDuplicates = new CheckDuplicatesArrayValues(arrayToCheck);
        checkDuplicates.runCheckIfArrayContainsDuplicates();

        // No. 3
//        int [] arrayToRemoveDuplicates = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 10};
//        RemoveDuplicatesElementsArray removeDuplicates = new RemoveDuplicatesElementsArray(arrayToRemoveDuplicates);
//        removeDuplicates.runRemoveDuplicatesElements();

        // No. 4


        // No. 5
        System.out.print("Enter string to reverse : ");
        String wordToReverse = sc.nextLine();
        ReverseTheString reverseTheString = new ReverseTheString(wordToReverse);
        reverseTheString.runReverseString();

        sc.close();
    }
}