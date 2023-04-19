package SDET_Java_General_Programs;

public class Count_the_Numbers {
public static void main(String[] args) {
	
	int num =1234556;
	
	int count=0;
	
	while(num>0) {
		
		num=num/10;
		count++;
	}
	System.out.println("number of digit: "+count);
	
	
}
}
