package SDET_Java_General_Programs;

public class Sum_ofthe_Elements_in_Array {

	public static void main(String[] args) {
	
		int a[]= {2,3,5,6,3,8,6};
		
		int sum=0;
		
		for(int i=0; i<a.length;i++) {		
		sum=sum+a[i];
		}
		
// Enhanced for loop
		
//		for(int value:a) {
//		sum=sum+value;
//		}
		
		
		System.out.println("Sum of the given array: "+sum);
		
	}

}
