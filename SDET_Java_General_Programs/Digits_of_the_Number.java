package SDET_Java_General_Programs;

public class Digits_of_the_Number {

	public static void main(String[] args) {


		int num =8547439;
		
		int digits=0;
	
		while(num>0) {
			
		num=num/10;
		digits++;
			
		}

		System.out.println("digits of the given number:"+digits);
	}

}
