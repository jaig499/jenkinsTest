package org.afterclass;

public class PanindromeIn100Nums {
	
		public static void main(String[] args) {
			
			
			
			for(int pal=1; pal<=1000; pal++) {
				int mod,res=0;
				int a=pal;
				
				while(a>0) {
					
					mod=a%10;
					res=(res*10)+mod;
					a=a/10;
				
				}
				
				if(pal==res) {
					System.out.println(pal);
				}
					
				
				
			}
		}	
			

}
