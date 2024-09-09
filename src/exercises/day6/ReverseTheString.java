package exercises.day6;

public class ReverseTheString {
    String word;

    public ReverseTheString(String word) {
        this.word = word;
    }

    private void reverseString() {
        // converting String into char array
        char [] newCharacters = new char[word.length()];

        // copying char by char into the new char [] array
        for (int i = 0; i < word.length(); i++)
            newCharacters[i] = word.charAt(i);

        int left = 0; // left index (first string element)
        int right = word.length() - 1; // last string element

        while (left < right) {
            char tempChar = newCharacters[left];
            newCharacters[left] = newCharacters[right];
            newCharacters[right] = tempChar;

            left++;
            right--;
        }

        // converting the char back to String(object)
        System.out.println(new String(newCharacters));
    }

    public void runReverseString() {
        reverseString();
    }
}
