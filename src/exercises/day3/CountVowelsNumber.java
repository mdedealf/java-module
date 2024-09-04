package exercises.day3;

public class CountVowelsNumber {
    String stringWord;
    char[] vowelsList = {'a', 'e', 'i', 'o', 'u'};

    public CountVowelsNumber(String stringWord) {
        this.stringWord = stringWord;
    }

    public int countVowelsNumber() {
        // define a temporary variable to count vowels
        int tempCount = 0;

        // first for loop to define currentCharAt from the given string
        for(int i = 0; i < stringWord.length(); i++) {
            char currentChatAt = stringWord.charAt(i);
//            System.out.print(currentChatA t+ " ");

//            for(int j = 0; j < vowelsList.length; j++) {
            for (char c : vowelsList) {
                // check current index is it a vowel or not
//                System.out.print(currentChatAt + " ");
                if (currentChatAt == c) {
                    tempCount++;
                    break; // avoid counting same character again
                }
            }
        }
        return tempCount;
    }
}
