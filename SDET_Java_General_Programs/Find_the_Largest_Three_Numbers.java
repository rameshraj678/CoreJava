package SDET_Java_General_Programs;

import java.util.Scanner;

public class Find_the_Largest_Three_Numbers {

	public static void main(String[] args) {
		
		
		int a=800, b=300,c=320;
		
//		Scanner sc=new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		System.out.println("Enter the a value:");
//		
//		int b =sc.nextInt();
//		System.out.println("Enter the b value:");
//		
//		int c =sc.nextInt();
//		System.out.println("Enter the c value:");
		
		if(a>b && a>c) {
			System.out.println(a+":" +"a is the big value");
		}
		else if (b>a && b>c) {
			System.out.println(b+":"+"b is the big value");
		}
		else {
			System.out.println(c+":"+"c is the big value");
		}
	}

}
