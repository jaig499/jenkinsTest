package log.org;

public class Patterns {
	
	private void triangle() {
		
		int numofLines = 4;
		
		int row,column;
		
		for(row=0; row<numofLines; row++) {
		                                                                   //(r,c)   
			for(column=0; column<=row; column++) { //1st time --> draw until (0,0)
												   //2nd time --> draw until (0,1)	
				System.out.print("* ");            //3rd time --> draw until (0,2)
				                                   //4rd time --> draw until (0,3)
			}
			System.out.println();
		}
	}
	
	private void numberPattern() {
		
		int numLineLimit = 5;
		
		int temp=1;
		int row,column=0;
		
		for(row=0; row<numLineLimit; row++) {
			
			for(column=0; column<=row; column++) {
				
				System.out.print(temp+" ");
				temp++; //This temp will increment value one by one so the number will print in 
						//sequential order
			}
			System.out.println();
		}
		

	}
	
	public static void main(String[] args) {
		
		Patterns p=new Patterns();
		p.numberPattern();
		
		
		
		
		
		
		
		
		
		
	}

}
