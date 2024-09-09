package exercises.day6;

public class BubbleSorting {
    public static void bubbleSortAscending(int[] array) {
        int arrLength = array.length;

        // first for loop
        for(int i = 0; i < arrLength - 1; i++) {
            // second for loop to compare 2 adjacent array elements
            for(int j = 0; j < arrLength - i - 1; j++) {
                // check adjacent element value if > swap the element position
                if(array[j] > array[j+1]) {
                    // define a temp variable to store swapped value
                    int tempEl = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempEl;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] array) {
        int arrLength = array.length;

        for (int i = 0; i < arrLength - 1; i++) {
            for(int j = 0; j < arrLength - i - 1; j++) {
                if(array[j] < array[j+1]) {
                    int tempEl = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempEl;
                }
            }
        }
    }
}
