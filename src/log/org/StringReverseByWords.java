package log.org;

import java.nio.charset.MalformedInputException;

public class StringReverseByWords {
	
	String given="Hi This Is Jaiganesh";
	String temp="";
	
	private void StringRev() {
		
		String[] splitString = given.split(" ");
		
	for(int j=splitString.length-1; j>=0; j--) {
		temp = temp+splitString[j]+" ";	
	}
		System.out.println(temp);
		//System.out.println();
		}

	public static void main(String[] args) {
		
		StringReverseByWords s=new StringReverseByWords();
		s.StringRev();
	}
}
