package SDET_Java_General_Programs;

public class Even_and_Odd_Numbers_Count {

	public static void main(String[] args) {
		
		int num = 8643572;
		
		int even =0;
		int odd=0;
		

		while(num>0) {
			num=num/10;
			
			if(num%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("even numbers:"+even);
		System.out.println("odd numbers:"+odd);

	}

}
