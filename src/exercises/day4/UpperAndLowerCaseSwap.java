package exercises.day4;

import java.util.Scanner;

public class UpperAndLowerCaseSwap {

    public String upperAndLowerCaseSwapper() {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Input words to swap (e.q ThE End OF TodAy) :");
        String words = inputString.nextLine();
        StringBuilder swappedWords = new StringBuilder();

        for(int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            // Check if the character is lowercase, if so convert to uppercase
            if (Character.isLowerCase(ch)) {
                swappedWords.append(Character.toUpperCase(ch));
            }
            // Check if the character is uppercase, if so convert to lowercase
            else if (Character.isUpperCase(ch)) {
                swappedWords.append(Character.toLowerCase(ch));
            }
            // If neither, just append the character as it is (for special characters, digits, etc.)
            else {
                swappedWords.append(ch);
            }
        }
        return swappedWords.toString();
    }
}
