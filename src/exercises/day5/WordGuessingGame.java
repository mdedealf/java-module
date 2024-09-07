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
    /*  updateHiddenWord(String word, String hiddenWord, char guess): Update the hidden
        word by revealing the correctly guessed character and return the new hidden word.
     */
    /*  displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft):
        Show the final game result, including whether the player won or lost, and reveal the word if the player didn't guess it.
     */

import java.util.Scanner;

interface WordGuessing {
    int getRandomIndex(int arraySize);
    String selectRandomWord();
    String hideWord(String word);
    char getPlayerGuess();
    boolean isGuessCorrect(String word, char guess);
    String updateHiddenWord(String word, String hiddenWord, char guess);
//    String displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft);
    void runWordGuessingGame();
}

public class WordGuessingGame implements WordGuessing {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getRandomIndex(int arraySize) {
        return (int) (Math.random() * arraySize);
    }

    @Override
    public String selectRandomWord() {
        String [] wordsCollections = {"hunter", "police", "programmer", "designer", "doctor", "house", "java"};
        int randomIndex = getRandomIndex(wordsCollections.length);
//        System.out.println(randomIndex);

        return wordsCollections[randomIndex];
    }

    @Override
    public String hideWord(String word) {
        int wordLength = word.length();
        char [] wordToUnderscore = new char[wordLength];
        StringBuilder wordResult = new StringBuilder();

        // Replace each string character into underscore
        for (int i = 0; i < wordLength; i++) {
            wordToUnderscore[i] = '_';
        }

        // Convert back into a string of underscore
        for (int i = 0; i < wordLength; i++) {
            wordResult.append(wordToUnderscore[i]);
        }

        return wordResult.toString();
    }

    @Override
    public char getPlayerGuess() {
        System.out.print("Guess a character : ");
        return scanner.next().charAt(0);
    }

    @Override
    public boolean isGuessCorrect(String word, char guess) {
        // check if guess char is exist in the string word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) return true;
        }

        // if character doesn't exist in the string
        return false;
    }

    @Override
    public String updateHiddenWord(String word, String hiddenWord, char guess) {
        return "";
    }


    @Override
    public void runWordGuessingGame() {
        // Object reference to class WordGuessingGame
        WordGuessingGame wordGuessingGame = new WordGuessingGame();

        String randomWord = wordGuessingGame.selectRandomWord();
        System.out.println(randomWord);

        String hiddenWord = wordGuessingGame.hideWord(randomWord);
        System.out.println(hiddenWord);

        char guessedCharacter = wordGuessingGame.getPlayerGuess();
        System.out.println(guessedCharacter);

        boolean isCharCorrect = wordGuessingGame.isGuessCorrect(randomWord,guessedCharacter);
        System.out.println(isCharCorrect);
    }
}
