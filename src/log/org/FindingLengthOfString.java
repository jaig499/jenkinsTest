package log.org;

public class FindingLengthOfString {
	
	String given="Jaiganesh";
	
	private void method1() {
	
		System.out.println(given.length());
		
		char[] array = given.toCharArray();
		
		int temp=0;
		
		for(int i=0; i<array.length; i++) {
			temp++;
		}
		System.out.println(temp);
	}
	
	
	
	public static void main(String[] args) {
		
		FindingLengthOfString m1=new FindingLengthOfString();
		
		m1.method1();
		
		
	}

}
