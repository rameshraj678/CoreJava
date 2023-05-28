package SDET_Java_General_Programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
	
		int num=sc.nextInt();
		
		int org_num=num;		
		int rev=0;
			
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
				
		}
			if(org_num==rev) {
				System.out.println("Palindrome number");
			}
			else {
				System.out.println("Not palindrome");
			}*/

		
		// Approach 2
		
	int num=767;
	
	int rev=0;
	int org_num=num;
	
	while (num!=0) {
		
		rev=rev*10+num%10;
		num=num/10;
	}
	if(org_num==rev) {
		System.out.println("Palindrome");
	}
	else {
		
		System.out.println("Not palindrome");
	}
			
			
		}
}
