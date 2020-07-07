package org.afterclass;

import java.util.Scanner;

public class ReverseOfAString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String given = sc.nextLine();
		String pal=given;
		String temp = "";
		for(int i=given.length()-1; i>=0; i--) {
			char cha = given.charAt(i);
			temp=temp+cha;
		}
		
		System.out.println(temp);
		System.out.println();
		if(pal.equals(temp)) {
			System.out.println("It is a palindrome String");
		} else {
			System.out.println("Not palindrome String");
		}
	}
}
