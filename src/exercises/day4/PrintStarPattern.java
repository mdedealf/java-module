package exercises.day4;

public class PrintStarPattern {
    int nNumber;

    public PrintStarPattern(int nNumber) {
        this.nNumber = nNumber;
    }

    public void printStar() {
        System.out.print("Print star from : " + nNumber + " given number\n");

        // this first For will start from i = 1 and have iteration up to given nNumber
         for(int i = 1; i <= nNumber; i++) {
             // second for will start from  j = 1, and iterate as the current i number
             for(int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
