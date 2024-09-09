package exercises.day6;

public class CheckDuplicatesArrayValues {
    private final int [] arrayOfNumbers;

    public CheckDuplicatesArrayValues(int [] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    private boolean checkIfArrayContainsDuplicates() {

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            for(int j = i + 1; j < arrayOfNumbers.length; j++) {
                if(j != i && arrayOfNumbers[i] == arrayOfNumbers[j]) return true;
            }
        }
        return false;
    }

    public void runCheckIfArrayContainsDuplicates() {
        if(checkIfArrayContainsDuplicates()) System.out.println("\n\nThe array contains duplicates");
        else System.out.println("\n\nThe array does not contain duplicates");
    }
}
