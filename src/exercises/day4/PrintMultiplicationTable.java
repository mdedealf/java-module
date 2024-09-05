package exercises.day4;

public class PrintMultiplicationTable {
    int input;

    public PrintMultiplicationTable(int input) {
        this.input = input;
    }

    public void printMultiplicationTable() {
        System.out.println("Print table for multiplication of input " + input + "^2");

        // Print the result of multiplication as a table
        // first for is creating the column
        for (int i = 1; i <= input; i++) {
//            System.out.print(i + "\t");
            // second for is creating the row
            for(int j = 1; j <= input; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
