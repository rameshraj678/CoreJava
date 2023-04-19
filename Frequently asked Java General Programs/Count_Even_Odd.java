package SDET_Java_General_Programs;

public class Count_Even_Odd {

	public static void main(String[] args) {
		
		
		int num=123456;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {				//123456
			
			int rema=num%10;		//6  5  4  3  2  1  " % This operator gives the remainder of an integer after division"
			
			if (rema%2==0){
				
					even_count++;    //1 2 3
			}
			
			else {
				
				odd_count++;     		//1 2 3
			}
			
			num=num/10;				// "/" it will given denominator value or rest of the value 
		}

		System.out.println("number of even number:"+even_count);
		System.out.println("number of even number:"+odd_count);
}
}
