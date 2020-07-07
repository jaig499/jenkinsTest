package org.afterclass;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		long given = sc.nextLong();
		
		long backUp=given;
		long mod,res=0;
		
		while(given>0) {
			
		mod=given%10; // 123 % 10 = 3
		res=(res*10)+mod; // 0 + 3 = 3 // 30 + 2 = 32 // 320 + 1 = 321 
		given=given/10; // 123 / 10 = 12 
		
		}
		System.out.println("Reverse of: "+backUp+" => "+res);
		System.out.println();
		if(backUp==res) {
			System.out.println("It is a Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
		
		
	}

}
