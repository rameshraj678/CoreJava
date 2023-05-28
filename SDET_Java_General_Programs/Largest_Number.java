package SDET_Java_General_Programs;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int b =sc.nextInt();
		
		System.out.println("Enter the Third Number:");
		int c=sc.nextInt();
		
	// logic 1
		
	/*	if(a>b && a>c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+"is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}*/
	
	// logic 2
		
//		int largest=a>b?a:b;
//		int largest1=c>largest?c:largest;
		
		
//	 Logic 3

		int largest =	c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest+"is a largest");
		
		
	
	
	
	}

}
