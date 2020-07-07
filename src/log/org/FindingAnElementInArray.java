package log.org;

import java.util.Scanner;

public class FindingAnElementInArray {

	int[] array= {23,45,75,34,67};
	
	int needToFind;
	
	boolean status;
	Scanner sc=new Scanner(System.in);
	
	private void logic() {
	
		for(int j=0; j<=3; j++) {
			
			System.out.println();
			
		System.out.println("Enter the number to find:");
		
		needToFind = sc.nextInt();
		
			for(int i=0; i<array.length; i++) {
				
				if(array[i]==needToFind) {
				status=true;
				break; //This will terminate the loop when the number is matched so,
					  //the rest of numbers will not be checked.
			}else {
				status=false;
			}
		}

		if(status==true) {
			System.out.println("Yayy! Given number is there");
		}else {
			System.out.println("Oops! Given number is not there");
		}
		}
	}
	
	public static void main(String[] args) {
		
		FindingAnElementInArray f=new FindingAnElementInArray();
		f.logic();
	}
}
