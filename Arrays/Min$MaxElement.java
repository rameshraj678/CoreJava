package Arrays;

import java.util.Arrays;

public class Min$MaxElement {

	// Find the min and max element from the given int array
	
	
	static int min (int a[],int n) {
		return Arrays.stream(a).min().getAsInt();		
		
//		return (n==1)? a[i]:Math.min(a[i],min(a,i+1,n-1));	
		
		
	}
	
	static int max(int a[],int n) {
		return Arrays.stream(a).max().getAsInt();
		
//		return (n==1)? a[i]: Math.max(a[i],max(a, i+1,n-1));
		
		
	}
			
	
	
	public static void main(String[] args) {
	int a[]= {12,45,65,87,76};
	int n=a.length;
	
	System.out.println(min(a,n));
	System.out.println(max(a,n));

	
	
	
}
}