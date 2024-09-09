package exercises.day6;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesElementsArray {
    private final int [] array;

    public RemoveDuplicatesElementsArray(int [] array) {
        this.array = array;
    }

    private void removeDuplicatesElements() {
        int arrayLength = array.length;
        // Initialize temporary index for the next index element
        int tempIdx = 0;

        if (arrayLength == 1 || arrayLength == 0) {
            System.out.println("\n\nThere is no duplicate elements in the array");
            return;
        }



    }

    public void runRemoveDuplicatesElements() {
        removeDuplicatesElements();
    }
}
