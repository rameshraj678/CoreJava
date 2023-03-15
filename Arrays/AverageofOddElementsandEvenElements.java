package Arrays;

public class AverageofOddElementsandEvenElements {

	// Avarage of odd and even element is greater
	
	public static void main(String[] args) {
	
		int a[]= {34,2,12,4,1,7,45};
		int n = a.length;
		int evensum=0, oddsum=0, evencount=0,oddcount=0;
		
		
		for(int i=0;i<n;i++) {
			
			if(a[i]%2==0) {
			evensum =evensum+a[i];
			evencount++;
						
			}
			else {
				oddsum =oddsum+a[i];
				oddcount++;
			}
		}
		double avgodd=oddsum/oddcount;
		double avgeven=evensum/evencount;
		System.out.println(avgeven);
		System.out.println(avgodd);
		if(avgeven>avgodd) {
			System.out.println("/nAvarage of even element is greater");
		}
		else {
			System.out.println("Avarage of odd element is greater");
					
		
		}
		
	}

}
