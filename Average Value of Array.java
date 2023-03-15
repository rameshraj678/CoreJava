package Arrays;

public class AverageValueofArray {

	
	
		
		static double Avarage(int a[], int n) {
			
			int sum = 0;
			for (int i=0;i<n;i++) {
				
				sum += a[i];
			
			
			}
			
			return (double) sum/n;
			
		}
		
		public static void main(String[] args) {
			
			
			int a[]= {6,4,5,1,4};		//6+4+5+1+4 =20/5=4
			int n = a.length;
			System.out.println(Avarage(a,n));
			
	}

}
