package SDET_Java_General_Programs;

public class Min_Max_Number_inthe_Array {

	public static void main(String[] args) {

//Min value in the Array		
	/*	
		int a []= {23,45,67,43,13,78,56};
		
		int min =a[0];
		
		for(int i=1;i<a.length;i++) {
			 
			if(a[i]<min) {
				
				min=a[i];
			}
		}
		System.out.println(min);	*/

//Max value in the Array
		
		int a []= {23,45,67,43,13,78,56};
		
		int max =a[0];
		
		for(int i=1;i<a.length;i++) {
			 
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		System.out.println(max);	
	}

}
