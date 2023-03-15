package Arrays;

public class SumofallEvenAndOddIndexedelements {

	 /// Find out the sum of all even and odd indexed elements from a given int array
	
	public static void main(String[] args) {
		
//		int a[]= {2,4,5,7,9,10,6};
//		
//		int even =0, odd=0;
//		
//		for(int i=0; i<a.length;i++) {
//			
//			if(i%2==0) 
//				
//				even += a[i];
//			else 
//				odd += a[i];
//			}
//			System.out.println("even index sum of position :" + even);
//			
//			System.out.println("odd index sum of position :" + odd);
//		}

		
		// 2nd Method
		
	int a[]= {3,5,6,8,10,1,2};
	int n =a.length;
	
	int even = 0;
	int odd = 0;
	for(int i=0; i<n;i++) {
		
		if((i &1) !=0) {
			
			odd += a[i];
		}
		
		else {
			even +=a[i];		
		}
		
	}
	System.out.println("sum of even :"+ even);
	System.out.println("sum of odd:" +odd);
	
	}
}
