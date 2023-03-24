package Arrays;

import java.util.Arrays;

public class SecondBiggestElementintheArray {

	// Find the 2nd heigest element from the given int array
	int i, first=0, second=0;
	 int print2ndLargestEle(int a[], int a_size) {
		if (a_size < 2) {
			System.out.println("invaild element");
		}

		Arrays.sort(a);
		first=a[a_size-1];

		for (i = a_size - 2; i >= 0; i--) {

			if (a[i] != a[a_size - 1]) {
	
				second=a[i];
//				System.out.println("the second largest element:  " + "" + a[i]);
				break;
			}

		}
		return second;

	}

	public static void main(String[] args) {

		int a[] = { 75, 3, 45, 2, 34, 5,95,200 };
		int n = a.length;
		SecondBiggestElementintheArray ob=new SecondBiggestElementintheArray();
		
		System.out.println("the second largest element:  " + ob.print2ndLargestEle(a, n));

	}

}
