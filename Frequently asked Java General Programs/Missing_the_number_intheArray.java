package SDET_Java_General_Programs;

public class Missing_the_number_intheArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++) {
			
		sum2=	sum2+i;
		}
		System.out.println(sum2);
		System.out.println("missing number:"+(sum1-sum2));
	}

}
