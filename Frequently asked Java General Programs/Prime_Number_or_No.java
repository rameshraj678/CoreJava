	package SDET_Java_General_Programs;
	
	public class Prime_Number_or_No {
	
		public static void main(String[] args) {
	
			int num =9;	
			int count =0;
			
			if(num>1) {
			
					for(int i=1;i<=num;i++) {
					
						if(num%i ==0) 
							count++;
					}
						if(count==2) {								// not clarity need help
							System.out.println("is a prime number");
						}
						else {
//							
							System.out.println("Not a prime number");
						}
					}	
			
					else {
						System.out.println("Not a prime Number");
							}
					
			
					
				}
	}
