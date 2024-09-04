package exercises.day3;

public class FindLargestElementInArray {
    int[] arrayNumber;

    public FindLargestElementInArray(int [] arrayNumber) {
        this.arrayNumber = arrayNumber;
    }

    public int findLargestElementArray() {
        // Let assume index[0] is the largest element
        int maxNumber = arrayNumber[0];

        // check all the elements to get the element with max value
        for (int i = 1; i < arrayNumber.length; i++) {
            // check if current element / arrayNumber[i] > maxNumber then change the max value
            if(arrayNumber[i] > maxNumber) maxNumber = arrayNumber[i];
        }
        return maxNumber;
    }
}
