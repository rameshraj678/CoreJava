package SDET_Java_General_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
	int n1=3; int n2=5; int sum =0;
	
	System.out.print(n1+" "+n2);
	
	for(int i=2;i<10;i++) {
		
		sum=n1+n2;
		System.out.print(" "+sum);
		
		n1=n2;
		n2=sum;
		
		
	}
	}

}
