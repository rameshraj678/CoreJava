package Arrays;

public class MaxvalueAllevenindexedElements {

	static int maxvalue(int a[], int low, int high) {
	
		int max =a[low];
		int i;
		for( i = low;i<=high;i++) {
			
			if(a[i]>max) {
				
				max = a[i];
				
			}
				
		}
		return max;
		
	}
		
	public static void main(String[] args) {
		
		int a[]= {2,3,4,6,12,15};
		
		int n=a.length;
		
		System.out.println(maxvalue(a,0,n-1));
	}

}
