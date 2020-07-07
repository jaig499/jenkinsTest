package org.afterclass;

import java.util.Scanner;

public class CountOfANumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int given = sc.nextInt();
		
		int a=given;
		int b=given;
		int i,j=0;
		
		//count of digit
		while(a>0) {
		a=a/10;
		j=j+1;
		}
		System.out.println(j);
		
		int k,q=0;
		//sum of digit
		while(b>0) {
			k=b%10;
			q=q+k;
			b=b/10;
		}
		System.out.println("Sum of digits: "+q);
	}
}
