package org.afterclass;

import java.util.Arrays;
import java.util.Scanner;

public class RevNum {

	Scanner sc=new Scanner(System.in);
	
	public void reverseNumber() {
		System.out.println("Enter the number here:");
		int num = sc.nextInt();
	
		int z=num;
		int a,b=0;
		
		while(num>0) {
			
		a=num%10;
		b=(b*10)+a;
		num=num/10;
			
	}
		System.out.println("Reversed Number: "+b);
		
		if(z==b) {
			System.out.println();
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is not palindrome");
		}
	}
	
	public void sumOFDigits() {
		System.out.println("Enter the number to SUM:");
		int given = sc.nextInt();
		
		int a,b=0;
		
		while(given>0) {
			
			a=given%10;
			b=b+a;
			given=given/10;
			
		}
		System.out.println("Sum of the values is: "+b);
	}
	
	public void countOfDigits() {
		
		System.out.println("Enter the digits to count:");

		String given = sc.next(); 
		int count = 0;
		for(int i=0; i<given.length(); i++) {
			count++;
		}
		System.out.println("Number of occurances is "+count);
	}
	
	public void arraySortAsc() {
		
		int[] given = {3,6,10,2,11,40};
		int temp = 0;
		
	/*	Arrays.sort(given);
		
		for(int i=0; i<given.length; i++) {
			
			System.out.println(given[i]);
			
		}*/
		
		for(int j=0; j<given.length; j++) {
			
			int x1=0;
			
			for(x1=j+1; x1<given.length; x1++);
			
				if(given[j]>given[x1]) {
					
					given[j]=temp;
					given[j]=given[x1];
					given[x1]=temp;
					
				}
			for(int k=0; k<given.length; k++) {
				System.out.println(given[k]);
			}
		}
		
	}
	public static void main(String[] args) {
		RevNum rev=new RevNum();
		rev.arraySortAsc();
	}
}
