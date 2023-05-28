package SDET_Java_General_Programs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElements_in_Array {

	public static void main(String[] args) {
	
		//Approch 1  assending order
		
//		int a[]= {10,50,20,60,40,70,50};
		
//		System.out.println("before sorting the order: "+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("after sortring :"+Arrays.toString(a));

		
		
		// Approch2 assending order
//		int a[]= {10,50,20,60,40,70,50};	
//		System.out.println("before sorting the array: "+ Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("After sorting the array:"+Arrays.toString(a));
		
		
		// Approch3 Decending order
		
		Integer  a[]= {10,50,20,60,40,70,50};
		System.out.println("before sorting the array: "+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("after sorting decending order: "+Arrays.toString(a));
		
		
	}

}
