package log.org;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Finding_Number_Of_Occurance_Of_A_Char_In_String {
	
	Scanner sc=new Scanner(System.in);
	
	public char toFind = 'a';
	
	private void usingFor() {
		System.out.println("Enter the String value: ");
		String inputString = sc.nextLine();
		
		System.out.println("Enter the Character to find: ");
		char toFind = sc.next().charAt(0);
		
		 inputString = inputString.toLowerCase();
		int temp=0;
		
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.charAt(i)==toFind) {
				temp++;
			}
		}
System.out.println("Entered String is:- "+inputString+"\n"+"Entered Char to find is:- "+toFind+"\n"+"Number of occurance is:- "+temp);
	}
	
	
	private void withoutUsingFor() {
		System.out.println("Enter the string:");
		String inputString = sc.nextLine();
		System.out.println("Enter the char to find:");
		char toFind = sc.next().charAt(0);
		
		inputString = inputString.toLowerCase();
		
		String toFindString = Character.toString(toFind).toLowerCase();
	
		String removedString = inputString.replace(toFindString, "");
	
		int length=inputString.length()-removedString.length();
		
		System.out.println(length);
		
	}
	
	
	public static void main(String[] args) {
		Finding_Number_Of_Occurance_Of_A_Char_In_String s=new Finding_Number_Of_Occurance_Of_A_Char_In_String();
		s.withoutUsingFor();
	}

}
