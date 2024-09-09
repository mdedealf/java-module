package exercises.day6;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    private final int [] array;

    public FindAllDuplicates(int [] array) {
        this.array = array;
    }

    private List<Integer> findAllDuplicatesArray() {
        int arrLength = array.length;
        // sorting the array to make comparing each element easier
        BubbleSorting.bubbleSortAscending(this.array);
        List<Integer> duplicateArray = new ArrayList<>();

        for(int i = 0; i < arrLength; i++) {
            for(int j = i+1; j < arrLength; j++) {
                if(array[i] == array[j]) duplicateArray.add(array[j]);
            }
        }
        return duplicateArray;
    }

    public void runFindAllDuplicates() {
        if(array.length == 1 || array.length == 0) {
            System.out.println("[]");
        } else {
            List<Integer> duplicateArray = findAllDuplicatesArray();
            for(int list : duplicateArray) System.out.print(list + ",");
        }
    }
}
