package SDET_Java_General_Programs;

import java.util.Arrays;

public class BubbleSort_Elements_in_Array{

	public static void main(String[] args) {
	
		int a[]= {2,4,3,5,1};
		
		System.out.println("Arrays before sorting: "+ Arrays.toString(a));

		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;			
				}
			}
		}
		System.out.println("After sorting the array:"+Arrays.toString(a));	
	}

}
