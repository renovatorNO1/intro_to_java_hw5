package hw5;
import java.util.Scanner;
import java.io.*;
public class experiment {
	public static void main(String[] args)   {
		boolean again=true;
		while(again){ 
			try{
				File inFile = new File(args[0]); 
				Scanner input = new Scanner(inFile);
				String word; 
				PrintWriter output = new PrintWriter(args[1]);
				while(input.hasNext()){   
					word=input.nextLine(); 
					output.println(word); 
					}   
				output.close();
				again=false; }
			//end try 
			catch(FileNotFoundException e){
				System.out.println("Please try again with correct input file name"); 
				Scanner scan = new Scanner(System.in);
				args[0]=scan.next(); }
			catch(Exception e){
				System.out.println("Specify a command-line argument you idiot"); 
				again=false;
		} }//end while
		  }
}
