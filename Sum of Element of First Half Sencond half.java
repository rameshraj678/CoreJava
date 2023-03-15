package Arrays;

public class SumofElementofFirstHalf$Sencondhalf {

	public static void sum_ofFirstHalfandSecondHalf(int a[], int n){
		
		int sumfirst =0, sumsecond=0;
		for( int i=0;i<n;i++) {
			
			if(i<n/2) {
				sumfirst +=a[i];
			}
		
			else {
				sumsecond+= a[i];
				
			}
		}
		System.out.println(sumfirst);
		System.out.println(sumsecond);
	}
	
	 	
	public static void main(String[] args) {
		int a[]= {1,4,2,6,7,5,12,9,8};			//firsthlaf= 1+4+2+6=13 secondhalf= 7+5+12+9+8=41
		int n= a.length;
		sum_ofFirstHalfandSecondHalf(a,n);
		

	}

	
	
	
}
