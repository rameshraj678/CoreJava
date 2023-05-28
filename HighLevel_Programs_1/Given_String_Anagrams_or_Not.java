package HighLevel_Programs_1;

public class Given_String_Anagrams_or_Not {

	public static void main(String[] args) {
	
		
		// two words character are equal or not
		
		   String str1 = "listen";
	        String str2 = "silent";
	       
	        boolean areAnagrams = true;
	        
	        if (str1.length() != str2.length()) {
	            areAnagrams = false;   
	        } 
	        
	        else {
	            int[] freq1 = new int[26];
	            int[] freq2 = new int[26];
	           
	            for (int i = 0; i < str1.length(); i++) {
	                freq1[str1.charAt(i) - 'a']++;
	                freq2[str2.charAt(i) - 'a']++;
	            }
	            
	            for (int r = 0; r < 26; r++) {
	                if (freq1[r] != freq2[r]) {
	                    areAnagrams = false;
	                    break;
	                }
	            }
	        }
	        
	        if (areAnagrams) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }

	}

}
