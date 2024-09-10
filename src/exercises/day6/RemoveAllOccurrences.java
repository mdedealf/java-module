package exercises.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllOccurrences {
    private final int [] arrayOfNumbers;
    private final int key;

    public RemoveAllOccurrences(int [] arrayOfNumbers, int key) {
        this.arrayOfNumbers = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length);
        this.key = key;
    }

    private List<Integer> removeAllOccurrencesOfElementArray() {
        int arrLength = arrayOfNumbers.length;
        List<Integer> arrListOfOccurrences = new ArrayList<Integer>();

        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber != key) arrListOfOccurrences.add(arrayOfNumber);
        }
        return arrListOfOccurrences;
    }

    public void runRemoveAllOccurrences() {
        List<Integer> array = removeAllOccurrencesOfElementArray();
        for(int list : array) System.out.print(list+" ");
    }
}
