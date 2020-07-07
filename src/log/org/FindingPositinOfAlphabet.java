package log.org;

import java.util.Scanner;

public class FindingPositinOfAlphabet {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Letter to fing the possition of it:");
		
		String next = sc.next();
		
		char letter = next.charAt(0);
		
		letter = Character.toUpperCase(letter); //converting the letter to lower case and storing it back in same variable
		
		//Type casting syntax is = NewDataType newVariable = (NewDataType) oldVariable
		
		int intValueOfLetter = (int) letter;
		
		int possition = intValueOfLetter-64; //Is like Subracting from 3-2 = 1 
											//--> from the largest num to smallest num
		
		System.out.println(possition);
		
		char ch='s';
		
		int ch1 = (int) ch;
		
		int poss = ch1-96;
		
		System.out.println("---->"+poss);
		
	}

}
