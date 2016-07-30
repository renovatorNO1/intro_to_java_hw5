package hw5;
//*************************************
//
//  WordLists.java
//
//  Class to aid with Scrabble
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Lucas
//  Your Uni: yl3433
//**************************************
import java.io.*;
import java.util.*;

public class WordLists{

	private ArrayList<String> dictionary = new ArrayList<String>();
	//Store the dictionary into this arraylist
	public WordLists(String fileName){
		boolean again = true;//run again if a new file name is provided
		while (again){
			try {
				File inFile = new File(fileName); //create a file
	  
				Scanner input = new Scanner(inFile);
				//insert the file into the scanner
				String word; 
				while(input.hasNext()){   
					word=input.nextLine(); 
					dictionary.add(word); 
				} 
  
				input.close();//close the scanner
				again = false;//break from the loop
			} 
			catch(FileNotFoundException e){
				System.out.println("Please try again with correct input file name"); 
				Scanner scan = new Scanner(System.in);
				fileName =scan.next(); scan.close();}
		}	
	}
		
		


	public String[] lengthN(int n){
      ArrayList<String> words = new ArrayList<String>();
      for (String word: dictionary) {
    	  //test if the word contains n letters
    	  if (word.length() == n) {
    		 words.add(word); 
    	  }
      }
      //convert the arraylist to a string
      String[] arr = words.toArray(new String[0]);
      return arr;
  
	}

  public String[] startsWith(int n, char firstLetter){
	  ArrayList<String> words = new ArrayList<String>();
      for (String word: dictionary) {
    	  //Test if the words has n letters and
    	  //the first letter is the desired one
    	  if (word.length() == n && word.charAt(0) == firstLetter) {
    		 words.add(word); 
    	  }
      }
      //convert the arraylist to a string array
      String[] arr = words.toArray(new String[0]);
      return arr;
    
  }


  public String[] containsLetter(int n, char included){
	  ArrayList<String> words = new ArrayList<String>();
	  
      for (String word: dictionary) {
    	  boolean contained = false;//initiated the boolean value
    	  int length = word.length();
    	  //test if the word contains the letter
    	  for (int i=1; i<length;i++) {
    		  if (word.charAt(i) == included) {contained = true;}
    	  }
    	  //test if the word's first letter is the letter
    	  if (word.charAt(0) == included) {
    		  contained = false;
    	  }
    	  //test if the word has length n and
    	  //contains the desired character
    	  if (word.length() == n && contained) {
    		 words.add(word); 
    	  }
      }
      //convert the arraylist to a string array
      String[] arr = words.toArray(new String[0]);
      return arr;

  }

  public String[] vowelHeavy(int n, int m){
	  Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
	  ArrayList<String> words = new ArrayList<String>();
	  
      for (String word: dictionary) {
    	  int counter =0;//initiate a conter to keep track of number
    	  int length = word.length();
    	  //test if the vowel is included
    	  for (int i=0; i<length;i++) {
    		  for (char vowel: vowels) {
    			  if (word.charAt(i) == vowel) {counter += 1;break;}    			  
    		  }
    		  
    	  }
    	  //test if the length is n and contains m vowels
    	  if (word.length() == n && counter == m) {
    		 words.add(word); 
    	  }
      }
      //convert the arraylist to a string array
      String[] arr = words.toArray(new String[0]);
      return arr;
      

  }


  public String[] multiLetter(int m, char included){
	  ArrayList<String> words = new ArrayList<String>();
	  
      for (String word: dictionary) {
    	  int counter =0;//initiate the counter to keep track of the number
    	  int length = word.length();
    	  for (int i=0; i<length;i++) {
    		  if (word.charAt(i) == included) {counter+=1;}
    	  }
    	  if (counter >= m) {
    		 words.add(word); 
    	  }
      }
      //convert the arraylist to a string array
      String[] arr = words.toArray(new String[0]);
      return arr;

  }
  public static void main(String[] args) {
	  String str1 = new String("12345");
	  String str2 = new String("12345");
	  if (str1 == str2) {
		  System.out.println("they r equal");
	  }
	  if (str1.equals(str2)) {
		  System.out.println(str1.substring(0,5));
	  }
  }

} // end of class







