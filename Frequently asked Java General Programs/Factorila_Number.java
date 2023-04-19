package SDET_Java_General_Programs;

public class Factorila_Number {

	public static void main(String[] args) {
		
		// Factorial Number :  7numbers: 1*2*3*4*5*6*7  =5040

			int num=7;			
		
			long factorial=1;
			
//			for(int i=1;i<=num;i++) {    // acending order Factorial
				
//				factorial=factorial*i;
				
//			}
			
			for(int i=num;i>=1;i--) {		// decending order factorial
				
				factorial = factorial*i;
			}		
				System.out.println(factorial);
	}
}


