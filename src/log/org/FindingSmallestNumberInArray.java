package log.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindingSmallestNumberInArray {
	
	public int[] array = {3,45,1,43,55};
	
	private void method1UsingLogic() {
		
		int small=Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]<small) {
				small=array[i];
			}
		}
		System.out.println("Smallest number in the given array is "+small);
	}
	
	private void method2UsingCollections() {
		
		List list=new LinkedList();
		
		for(int j=0; j<array.length; j++) {
			list.add(array[j]); //array values is copied to list 
		}
		Collections.sort(list);
		System.out.println("Second smallest value is "+list.get(1));
		System.out.println("First smallest value is "+list.get(0));
	}
	
	private void method3UsingArrays() {
		Arrays.sort(array);
		System.out.println("Second smallest value is "+array[1]);
		System.out.println("First smallest value is "+array[0]);	
	}
	
	
	public static void main(String[] args) {
		
		FindingSmallestNumberInArray m1=new FindingSmallestNumberInArray();
		m1.method1UsingLogic();
		
		
	}

}
