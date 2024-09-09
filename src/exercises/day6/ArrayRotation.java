package exercises.day6;

public class ArrayRotation {
    private final int dimension;
    private final int [] arrayOfNumbers;

    public ArrayRotation(int dimension, int [] arrayOfNumbers) {
        this.dimension = dimension;
        this.arrayOfNumbers = arrayOfNumbers;
    }

    private int [] rotateArrayIndexValue() {
        // array length
        int arrLength = arrayOfNumbers.length;
        // initialize temporary array to store modified array values
        int [] arrTempValues = new int [arrLength];
        // initialize variable counter start at : 0
        int arrIdxStart = 0;

        // store the rest of array value after the d number index
        for(int i = dimension; i < arrLength; i++) {
            arrTempValues[arrIdxStart] = arrayOfNumbers[i];
            arrIdxStart++;
        }

        // store array index from start index(0) to - d into modified array
        for(int i = 0; i < dimension; i++) {
            arrTempValues[arrIdxStart] = arrayOfNumbers[i];
            arrIdxStart++;
        }

        return arrTempValues;
    }

    public void runRotateArray() {
        // declare an array variable to store modified array values
        int [] arrayAfterRotated;

        // check first if dimension is larger than the index of array
        if(dimension > arrayOfNumbers.length) {
            System.out.println("Dimension to rotate is larger than length ["+arrayOfNumbers.length+"] existed array index! ");
            return;
        } else arrayAfterRotated = rotateArrayIndexValue();

        System.out.println("Array before rotated : ");
        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + " ");
        }
        System.out.println("\nDimension to rotate : "+ dimension);

        System.out.println("\nFinal array result : ");
        for (int j : arrayAfterRotated) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
