package log.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class StringReverse {
	
	private void usingStringBuffer() {

		String s="Jaiganesh";
		
		StringBuffer sb=new StringBuffer();
		
		sb.append(s); //String s is overridded to sb
		sb.reverse(); //String value inside sb is reversed
		System.out.println(sb);
	}
	
	private void usingArray() {
		
		String s="Jaiganesh";
		
		char[] array = s.toCharArray();
		int j=array.length;
		
		String string="";
		
		for(int i=j-1; i>=0; i--) {
			
			 string=string+array[i];
			
		}
		System.out.println(string);
		
	}
	
	private void usingCollections() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value to be reversed:");
		String s = sc.nextLine();
		//char x;
		char[] a = s.toCharArray();
		
		List st=new LinkedList();
		
		for(int i=0;i<a.length;i++) {
			//x=a[i];
			//st.add(x); //This is one method
			
			st.add(a[i]);
		}
		Collections.reverse(st); //List value is reversed here
		
		String reversedString="";
		
		for(int j=0;j<st.size();j++) {
			
			reversedString=reversedString+st.get(j);
			
		}
		
		System.out.println(reversedString);
		
		}
		
	
		
	
	
	public static void main(String[] args) {
		
		StringReverse s=new StringReverse();
		//s.usingStringBuffer();
		s.usingCollections();
		
	}

}
