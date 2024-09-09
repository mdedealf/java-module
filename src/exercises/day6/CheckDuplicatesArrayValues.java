package exercises.day6;

public class CheckDuplicatesArrayValues {
    private final int [] arrayOfNumbers;

    public CheckDuplicatesArrayValues(int [] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    private boolean checkIfArrayContainsDuplicates() {

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            for(int j = i + 1; j < arrayOfNumbers.length; j++) {
                // check if i index and j index not in the same index value
                // and check if array value at index i equal to index j
                if(j != i && arrayOfNumbers[i] == arrayOfNumbers[j]) return true;
            }
        }
        return false;
    }

    public void runCheckIfArrayContainsDuplicates() {
        if(checkIfArrayContainsDuplicates()) System.out.println("\n\nThe array contains duplicates\n");
        else System.out.println("\n\nThe array does not contain duplicates\n");
    }
}
