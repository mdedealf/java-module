package exercises.day3;

public class AnagramChecker {
    String word1;
    String word2;

    public AnagramChecker(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public static void bubbleSort(char[] arr) {
        int arrSize = arr.length - 1;

        for(int i = 0; i < arrSize; i++) {
            for(int j = 0; j < arrSize - i; j++) {
                if(arr[j] > arr[j+1]) {
                    char tempEl = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempEl;
                }
            }
        }
    }

    public boolean isTwoWordsAnagram() {
        // check if the length of two string not equal then it is not an anagrams
        if(word1.length() != word2.length()) return false;

        // convert two given strings into char array
        char [] charWord1 = word1.toCharArray();
        char [] charWord2 = word2.toCharArray();

        // sort the char array to do comparing easier
        bubbleSort(charWord1);
        bubbleSort(charWord2);

        // Compare both word after sorted
        for(int i = 0; i < charWord1.length; i++){
            if(charWord1[i] != charWord2[i]) return false;
        }

        return true;
    }
}
