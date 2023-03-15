package Arrays;

import java.util.Arrays;

public class SecondBiggestElementintheArray {
	
	//////Find the 2nd max element from the given int array/////\\\\
	
	static int print2ndLargestEle(int a[], int a_size) {
		
		int i, first,second;
		
		if(a_size<2)	{
			System.out.println("invaild element");
		
		}
		
		Arrays.sort(a);
	
		for(i=a_size-2;i>0;i--) {
			
			if(a[i] !=a[a_size-1]) {
				System.out.println("the second largest element"+ a[i]);
				
		}
			
	}
			System.out.println("there is no second largest number");
			return a_size;


	}
	public static void main(String[] args) {
	
		int a[]= {75,3,45,2,34,5};
		int n=a.length;
		print2ndLargestEle(a, n);
		

	}

}
