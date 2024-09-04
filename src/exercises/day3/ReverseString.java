package exercises.day3;

public class ReverseString {
    String word;

    public ReverseString(String word) {
        this.word = word;
    }

    public String reverseString() {
        // converting String into char array
        char [] characters = word.toCharArray();

        // printing all the element of characters[]
        for (int i = characters.length - 1; i >= 0; i--)
            System.out.print(characters[i] + " ");

        int left = 0; // left index (first string element)
        int right = word.length() - 1; // last string element

        while (left < right) {
            char tempChar = characters[left];
            characters[left] = characters[right];
            characters[right] = tempChar;

            left++;
            right--;
        }

        // converting the char back to String(object)
        return new String(characters);
    }
}
