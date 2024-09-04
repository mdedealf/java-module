package exercises.day3;

public class FindTheSmallestNumber {
    int [] arrNumber;

    public FindTheSmallestNumber(int [] arrNumber) {
        this.arrNumber = arrNumber;
    }

    public int findSmallestElementNumber() {
        // define int n as the smallest index number
        int lowestNumber = arrNumber[0];

        // bruteforce using for loop to check all the elements number
        for(int i = 0; i < arrNumber.length; i++) {
            if(arrNumber[i] < lowestNumber) lowestNumber = arrNumber[i];
        }
        return lowestNumber;
    }
}
