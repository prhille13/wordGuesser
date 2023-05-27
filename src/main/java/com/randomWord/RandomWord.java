package com.randomWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWord {
	
	public static String randomWord(){
	
	// TODO Auto-generated method stub
    /**
     * Peter Hille; Wordle Clone
     * A random five-letter word will be selected and the user will try to guess the word.
     * If the letter is correct it will return green; if the letter is in the word, but in
     * a different position, it will return yellow, if the letter is not in the word it will
     * return grey.
     * The user will get six guesses per round.
     *
     */
	
	File fiveLW = new File("fiveLW.txt");
	FileReader fr = null;
	try {
		fr = new FileReader(fiveLW);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	BufferedReader br = new BufferedReader(fr);
		String line;
		List<String> wordList = new ArrayList<String>();
		
		//reads in file of five letter words and prints a random word
		try {
			while ((line = br.readLine()) != null) {
				wordList.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] stringArr = wordList.toArray(new String[0]);
		int rnd = new Random().nextInt(stringArr.length);
		String randomWord = stringArr[rnd];
		return randomWord;
}

	public boolean equalsIgnoreCase(String userGuess) {
		// TODO Auto-generated method stub
		return false;
	}
}

