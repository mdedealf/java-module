package exercises.day2;

public class RemoveString {
    String words;
    String stringToRemove;

    public RemoveString(String words, String stringToRemove) {
        this.words = words;
        this.stringToRemove = stringToRemove;
    }

    public String removeTheFirstOccurrence() {
        return words.replaceFirst(stringToRemove, "");
    }
}
