package exercises.day6;

public class BubbleSorting {
    public static void bubbleSort(int[] array) {
        int arraySize = array.length - 1;

        // first for loop
        for(int i = 0; i < arraySize; i++) {
            // second for loop to compare 2 adjacent array elements
            for(int j = 0; j < arraySize - i; j++) {
                // check adjacent element value if < swap the element position
                if(array[j] > array[j+1]) {
                    // define a temp variable to store swapped value
                    int tempEl = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempEl;
                }
            }
        }
    }
}
