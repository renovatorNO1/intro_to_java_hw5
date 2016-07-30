package hw5;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
//*************************************
//
//WordLists.java
//
//Class to aid with Scrabble
//Programming Project 5, COMS W1004
//
//
//Your Name: Lucas
//Your Uni: yl3433
//**************************************
public class WordListsTester {
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException terminate the program if the writing fails
	 */
	public static void main (String[] args) throws FileNotFoundException {
			//Create an infile
			WordLists haha = new WordLists("dictionary.txt");
			//Create an outfile
			PrintWriter outfile = new PrintWriter("output.txt");
			
			//Test function lengthN
			String[] array = haha.lengthN(3);
			outfile.println("this is the testing of the lengthN method");
			for (String word: array) {
				outfile.println(word);
				System.out.println(word);
			}
			// test function startsWith
			array = haha.startsWith(5, 'b');
			outfile.println("this is the testing of "
					+ "the startsWith method");
			for (String word: array) {
				outfile.println(word);
				System.out.println(word);
			}
			//Test function containsLetter
			array = haha.containsLetter(3, 'a');
			outfile.println("this is the testing of "
					+ "the containsLetter method");
			for (String word: array) {
				outfile.println(word);
				System.out.println(word);
			}
			//Test function vowelheavy
			array = haha.vowelHeavy(4, 3);
			outfile.println("this is the testing of"
					+ " the vowelHeavy method");
			for (String word: array) {
				outfile.println(word);
				System.out.println(word);
			}
			//Test fucntion multiLetter
			array = haha.multiLetter(3, 'e');
			outfile.println("this is the testing of the"
					+ " multiLetter method");
			for (String word: array) {
				outfile.println(word);
				System.out.println(word);
			}
			
			outfile.close();
		}
	
}
