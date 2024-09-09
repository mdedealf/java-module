package exercises.day5;

    /* TODO:

    /*  selectRandomWord() Choose and return a random word from the WORDS array
    */
    /*  hideWord() : Create and return a string of underscores with the
        same length as the input word.
    */
    /*  getPlayerGuess() : prompt the player for a guess
        and return the guessed character
     */
    /*  isGuessCorrect(String word, char guess) : check if the guessed
        character is in the word and return a boolean result
     */
    /*  updateHiddenWord(String word, String hiddenWord, char guess): Update
        the hidden word by revealing the correctly guessed character and return
        the new hidden word.
     */
    /*  displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft):
        Show the final game result, including whether the player won or lost,
        and reveal the word if the player didn't guess it.
     */

import java.util.Scanner;

public class WordGuessingGame {
    Scanner scanner = new Scanner(System.in);
    private final StringBuilder chosenHiddenWord = new StringBuilder();

    private int getRandomIndex(int arraySize) {
        return (int) (Math.random() * arraySize);
    }

    private String selectRandomWord(String [] wordsCollections) {
        int randomIndex = getRandomIndex(wordsCollections.length);
        return wordsCollections[randomIndex];
    }

    private String hideWord(String word) {
        // Replace each string character into underscore
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' ') chosenHiddenWord.append('_');
        }
        return chosenHiddenWord.toString();
    }

    private char getPlayerGuess() {
        System.out.print("Guess a character : ");
        return scanner.next().charAt(0);
    }

    private boolean isGuessCorrect(String word, char guess) {
        String normalizeWord = word.toLowerCase();
        // check if guess char is exist in the string word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == Character.toLowerCase(guess)) return true;
        }
        return false;  // if character doesn't exist in the string
    }

    private StringBuilder updateHiddenWord(String word, char guess) {
        String normalizeWord = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == Character.toLowerCase(guess)) {
                chosenHiddenWord.setCharAt(i, guess);
            }
        }
        return chosenHiddenWord;
    }

    private void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft) {
        if(wordToGuess.equalsIgnoreCase(hiddenWord))
            System.out.println("Congratulations! you guess the correct word. with remaining : "+attemptsLeft+ " attempt left.\n");
        else
            System.out.println("Unlucky! you can't guess the correct word. \nThe hidden word is : "+wordToGuess+"\n");
    }

    public void runWordGuessingGame() {
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.print("Do you want to play word guessing game (y/n) ? : ");
        String wantToPlay = String.valueOf(scanner.next().charAt(0));
        boolean isPlaying;

        if (wantToPlay.equalsIgnoreCase("y")) {
            System.out.println("\nGuess the blank word : ");
            isPlaying = true;
        }
        else {
            System.out.println("You don't want to play! try again later :)");
            isPlaying = false;
        }

        String [] wordsCollections = {"hunter", "police", "java", "book", "doctor", "house"};
        // select a random index of word from a string [] wordCollections
        String randomWord = selectRandomWord(wordsCollections);
        // initialize max attempt
        int maxAttempt = randomWord.length() + 2;

        if(isPlaying) {
            // convert chosen random word into _____ of random word with the same length
            String hiddenWord = hideWord(randomWord);
            System.out.println("Clue: "+randomWord);
            System.out.println(hiddenWord);
        }

        while (maxAttempt > 0 && isPlaying) {
            System.out.println("Your attempt left : " + maxAttempt);

            // get player guessed character
            char guessedCharacter = getPlayerGuess();

            // check player entered character
            boolean isGuessCharCorrect = isGuessCorrect(randomWord, guessedCharacter);

            // check entered char guess is correct
            String guessedWord = null;

            if (isGuessCharCorrect) {
                guessedWord = String.valueOf(updateHiddenWord(randomWord, guessedCharacter));
                System.out.println("\n" + guessedWord);
                if (chosenHiddenWord.toString().equalsIgnoreCase(randomWord)) {
                    displayGameResult(randomWord, guessedWord, maxAttempt);
                    maxAttempt = 0;
                    isPlaying  = false;
                    return;
                }
            } else {
                System.out.println("Wrong guess!");
                System.out.println("\n" + chosenHiddenWord);
            }
            maxAttempt--;
        }
    }
}
