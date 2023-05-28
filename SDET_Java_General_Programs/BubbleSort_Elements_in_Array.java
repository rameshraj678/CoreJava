package SDET_Java_General_Programs;

import java.util.Arrays;

public class BubbleSort_Elements_in_Array{

	public static void main(String[] args) {
	
//		int a[]= {2,4,3,5,1};
		
		int a=85723;
		String num=String.valueOf(a);
		char narray[]=num.toCharArray();
		int n[]=new int [num.length()];
		
		
//		int n=a.length;
		
		for(int i=0;i<narray.length-1;i++) {
			
			for(int j=0;j<narray.length-1;j++) {
				
				if(n[j]>n[j+1]) {
					
					int swap=n[j];
					n[j]=n[j+1];
					n[j+1]=swap;			
				}
			}
		}
		System.out.println("After sorting the array:"+Arrays.toString(n));	
	}

}
