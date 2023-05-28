package SDET_Java_General_Programs;

public class palindrom_string_diffrent_Approach {
	String s="madam";
	
	String palin="";
	
//	System.out.println(polyn or not(s));
	
	public  static String Palindrome(String r) {
		
		char value[]=r.toCharArray();
		
		int i=0;
		int j=r.length()-1;
		
		while (j>i) {
			if(value[i]!=value[i]) {
				
				return "not polyndrome";
			}
			++i;
			--j;
			}
		return "polindrome";
		}
	}

