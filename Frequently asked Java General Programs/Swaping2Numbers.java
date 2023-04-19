package SDET_Java_General_Programs;

public class Swaping2Numbers {
	
	public static void main(String[] args) {
		
		int a=60, b=90;
		
		System.out.println("Before swaping the ages:... "+a+" :"+b);
		
		
		//Logic 1 -  Thrid Varible
		
	/*	int	    c=a;
				a=b;
				b=c; */
	
				
		//Logic 2 : use "+ & -"  without using third variable 		
				
	/*	a=a+b;     //a+b(60+90)  a=150
		b=a-b;		//a-b(150-90) b=60 
		a=a-b;     // a=b(150-60)a=90 
		
		
		//Logic 3: use "* & /" without using third variable 
		
		
		a=a*b;  // 90*60 (a=5400)
		b=a/b; // 5400/60(b=60)
		a=a/b; // 5400/60 (a=90)
		
		//Loginc 4: use bitwise XOR (^)
		
		a=a^b;			
		b=a^b;
		a=a^b;*/
		
		//Logic 5: single Statement
		
		b=a+b-(a=b);
		
		// executing here right to left
		// a=b b value assinged a: ie., 90
		//a+b=90+60=150-90=60
		
		
				
				System.out.println("After swaping the ages:... "+a+" :"+b);
	
		
	
	}

}
