package exercises.day5;

public class CheckPairsOfNumbers {
    int [] arrayOfNumbers;
    int numberOfSum;

    public CheckPairsOfNumbers(int [] arrayOfNumbers, int numberOfSum) {
        this.arrayOfNumbers = arrayOfNumbers;
        this.numberOfSum = numberOfSum;
    }

    public static int [] findTwoSumOfNumber(int [] arrayOfNumbers, int numberOfSum) {
        // For loop each of element array
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            // For each element array, check for a match result
//            System.out.println(i + " ");
            for(int j = i + 1; j < arrayOfNumbers.length; j++) {
//                System.out.print(j);
                // Check if two added numbers match the target number
                if(arrayOfNumbers[i] + arrayOfNumbers[j] == numberOfSum) return new int[] {i, j};
            }
        }
        // If there is no solution
        return null;
    }

    public static void runFindTwoSumOfNumber() {
        int [] arrayOfNumbers = {1,4,10,22,2,4,3,7,17,11,15};
        int numberOfSum = 9;

        System.out.println("\nArray numbers : ");
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i]+ " ");
        }
        System.out.println("\nTarget from two sum of indicies : "+numberOfSum);

        CheckPairsOfNumbers checkPairsOfNumbers = new CheckPairsOfNumbers(arrayOfNumbers, numberOfSum);
        int[] result = findTwoSumOfNumber(arrayOfNumbers, numberOfSum);

        // Check if there is no pair of the target of sum
        if( result != null ) System.out.println("\nResult is found at : [" + result[0] + "," + result[1] + "] indicies\n");
        else System.out.println("No pair exist.\n");
    }
}
