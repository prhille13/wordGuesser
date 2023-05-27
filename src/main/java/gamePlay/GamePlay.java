package gamePlay;
import java.util.Scanner;

import com.randomWord.*;


public class GamePlay {
	
	public static void main(String[] args) {
		RandomWord randomWord =  new RandomWord();
		String userGuess = getUserInput();	
		
		compareWords(randomWord, userGuess);
	}
	
	public static String getUserInput() {
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Guess a five letter word: ");
		String userInput = scanner.nextLine();
		return userInput.trim();
	  }
	}
	public static void compareWords(RandomWord randomWord, String userGuess) {
		if(randomWord == null || userGuess == null) {
			System.out.print("Invalid input.");
			return;
		}
		if (userGuess.length() > 5) {
			System.out.println("Word length exceeds the maximum allowable.");
			return;
		}
		System.out.println("Random word: " + randomWord);
		System.out.println("User guess: " + userGuess);
	
	
	if (randomWord.equalsIgnoreCase(userGuess)){
		System.out.println("Congratulations! You guessed the word correctly.");
    } else {
        System.out.println("Oops! Your guess is incorrect.");
    }
	}
}
