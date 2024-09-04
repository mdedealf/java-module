package exercises.day3;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int arrSize = arr.length - 1;

        // first for loop
        for(int i = 0; i < arrSize; i++) {
            // second for loop to compare 2 adjacent array elements
            for(int j = 0; j < arrSize - i; j++) {
                // check adjacent element value if < swap the element position
                if(arr[j] > arr[j+1]) {
                    // define a temp variable to store swapped value
                    int tempEl = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempEl;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
