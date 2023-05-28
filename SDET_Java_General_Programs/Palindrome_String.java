package SDET_Java_General_Programs;

import java.util.Scanner;

public class Palindrome_String {

	
	public static void main(String[] args) {

	// Approach 1 using scanner class
		
	/*	Scanner sc= new Scanner (System.in);	
		System.out.println("Enter Letters:");
		
		String str=sc.next(); 		// giving value like MADAM		
		String org_str=str;			// varible assing 
		
		int lent=str.length();
		
		String pali="";
		
		for(int i=lent-1;i>=0;i--) {
			
			pali=pali+str.charAt(i);
		}
		
		if(org_str.equals(pali)){
			
			System.out.println(pali+" "+"Palindrome");
		}
		
		else {
			System.out.println(pali+" "+"Not palindrome");
		}*/
	
//Approach 2 using by middile concept 
		
		String str = "rame";
		String upp=str.toUpperCase();
        
//		System.out.println(upp);		// check the change lowercase to uppercase 
	
		boolean isPalindrome = true;

        for (int i = 0; i < upp.length() / 2; i++) {
       
            if (upp.charAt(i) != upp.charAt(upp.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(upp +" " +" is a palindrome.");
        } else {
            System.out.println(upp + " "+" is not a palindrome.");
        }
	}
}
        
/*		
    	String str="recacer";
		String rev="";
//		String upp_str=str.toUpperCase();

//		int len=str.length();
	
		for(int i=str.length()-1;i>=0;i--) {
		
		rev+= str.charAt(i);
		}
	
		if(str.equalsIgnoreCase(rev)){
			
		System.out.println("given string is palindrome");

		}
		else{
		System.out.println("not a palindrome");
		}
	}	
	
}*/

		

