package log.org;

public class Converting_Vowels_To_Special_Char {
	
	String inputString = "I love India";
	
	private void method1() {
	
		char[] array = inputString.toCharArray();
		
		for(int i=0; i<inputString.length(); i++) {
			
			if(inputString.charAt(i)=='A'||inputString.charAt(i)=='E'||inputString.charAt(i)=='I'||
			   inputString.charAt(i)=='O'||inputString.charAt(i)=='U'||inputString.charAt(i)=='a'||
			   inputString.charAt(i)=='e'||inputString.charAt(i)=='o'||inputString.charAt(i)=='u'||
			   inputString.charAt(i)=='i') {
				
				array[i]='*';
			}
		}
		
		for(int i=0; i<inputString.length(); i++) {
			
			System.out.print(array[i]);
			
		}
	}
	
	private void method2() {
		//using replace all method replacing the vowels to *
		System.out.println(inputString.replaceAll("[AEIOUaeiou]", "*"));

	}
public static void main(String[] args) {
	Converting_Vowels_To_Special_Char c=new Converting_Vowels_To_Special_Char();
	c.method2();

}
}
