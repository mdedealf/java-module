package exercises.day2;

public class PalindromeChecker {
    String word;

    public PalindromeChecker(String word) {
        this.word = word;
    }

    public boolean isPalindrome() {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
