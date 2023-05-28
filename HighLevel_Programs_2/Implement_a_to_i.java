package HighLevel_Programs_2;

public class Implement_a_to_i {

	//Approcah:1
	
/*	 public static void main(String[] args){
	        int val;
	        String strn1 = "12546";
	 
	        val = Integer.parseInt(strn1);
	        System.out.println("String value = " + strn1);
	        System.out.println("Integer value = " + val);
	 
	        String strn2 = "GeeksforGeeks";
	        try {
	            val = Integer.parseInt(strn2);
	            System.out.println("String value = " + strn2);
	            System.out.println("Integer value = " + val);
	        }
	        catch (NumberFormatException e) {
	            val = 0;
	            System.out.println("String value = " + strn2);
	            System.out.println("Integer value = " + val);
	        }
	    } */
	
	
	//Approcah2
	
	 static int myAtoi(String str)   {
	        // Initialize result
	        int res = 0;
	 
	        // Iterate through all characters
	        // of input string and update result
	        // take ASCII character of corresponding digit and
	        // subtract the code from '0' to get numerical
	        // value and multiply res by 10 to shuffle
	        // digits left to update running total
	        for (int i = 0; i < str.length(); ++i)
	            res = res * 10 + str.charAt(i) - '0';
	 
	        // return result.
	        return res;
	    }
	 
	    // Driver code
	    public static void main(String[] args) {
	      
	    	String str = "89789";
	         
	        // Function call
	        int val = myAtoi(str);
	        System.out.println(val);
	    }
}
