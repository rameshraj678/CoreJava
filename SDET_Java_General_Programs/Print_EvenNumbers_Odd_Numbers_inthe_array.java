package SDET_Java_General_Programs;

public class Print_EvenNumbers_Odd_Numbers_inthe_array {

	public static void main(String[] args) {
	
		int a[]= {2,4,3,5,8,6,9};
		System.out.println("Even number in the array.....");
		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]%2==0)		
//				System.out.print(+a[i]);		
//		}
				
		// Enhanced for loop
		
		for(int value:a) {
			
			if(value%2==0)
		System.out.println(value);
		}		
	
		System.out.println("    "); /// distance for two statements 
	
			System.out.println("Odd number in the arry.......");			
//			for (int i=0;i<a.length;i++) {
//			if (a[i]%2!=0)
//					
//					System.out.print(a[i]);
//			}
			
			for(int value:a) {
				
				if(value%2!=0)
					System.out.println(value);
			}
			
			
		
		
		
		

	}

}
