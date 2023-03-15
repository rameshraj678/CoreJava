package Arrays;

import java.util.Arrays;

public class FindtheSumofAllElementsintheArray {
	
	
	//Find the sum of all given elements from an int array----  threre are two ways 
	
	static int a[]= {74,3,22,13,2,};
	
	static int sum () {
		
		int sum =0;
		int i;
		
		for(i=0;i<a.length;i++) {
		
			sum += a[i];
		
			}
		
		return sum;
		
		
	
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(sum());
			
	
//		int sum = Arrays.stream(a).sum();		
//		System.out.println(sum);
		
		
		
	}			
		
}
