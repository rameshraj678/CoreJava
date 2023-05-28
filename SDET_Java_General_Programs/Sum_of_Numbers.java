package SDET_Java_General_Programs;

public class Sum_of_Numbers {

	public static void main(String[] args) {
	
		int num =15869;
		
		int sum =0;
		
		while(num>0) {  //15869
			
			sum=sum+num%10;		//	9+6+8+5+1=29
			
			num=num/10;  				//1586
		}
		
		System.out.println("sum of the value: "+num);
		
		
	}

}
