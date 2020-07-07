package log.org;

import java.util.Scanner;

public class SwapNumber {
	
	private void using3rdVariable() {
		
		int a=32;
		int b=100;
		
		System.out.println("Before Swapping"+"\n"+ "a value is "+a+"\n"+"b value is "+b);
		System.out.println("");
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping"+"\n"+ "a value is "+a+"\n"+"b value is "+b);
	}
	
	private void withoutUsing3rdVariable() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		a=a-b;
		b=a+b;
		a=b-a;
		
	System.out.println("After Swapping using add&sub "+"\n"+ "a value is "+a+"\n"+"b value is "+b);
	
	
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After Swapping using mul&div "+"\n"+ "a value is "+a+"\n"+"b value is "+b);
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		SwapNumber s=new SwapNumber();
		s.withoutUsing3rdVariable();
		
	}

}
