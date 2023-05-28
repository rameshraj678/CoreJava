package HighLevel_Programs_1;

public class Minimum_number_of_deletions_String_Palindrome {
	
	
	//Approch:1
	
	/*static int lps(String str) {
	        int n = str.length();
	 
	        // Create a table to store
	        // results of subproblems
	        int L[][] = new int[n][n];
	 
	        // Strings of length 1
	        // are palindrome of length 1
	        for (int i = 0; i < n; i++)
	            L[i][i] = 1;
	 
	        // Build the table. Note
	        // that the lower diagonal
	        // values of table are useless
	        // and not filled in the process.
	        // c1 is length of substring
	        for (int cl = 2; cl <= n; cl++) {
	            for (int i = 0; i < n - cl + 1; i++) {
	                int j = i + cl - 1;
	                if (str.charAt(i) ==
	                        str.charAt(j) && cl == 2)
	                    L[i][j] = 2;
	                else if (str.charAt(i) ==
	                              str.charAt(j))
	                    L[i][j] = L[i + 1][j - 1] + 2;
	                else
	                    L[i][j] = Integer.max(L[i][j - 1],
	                                         L[i + 1][j]);
	            }
	        }
	 
	        // length of longest
	        // palindromic subsequence
	        return L[0][n - 1];
	    }
	 
	    // function to calculate minimum
	    // number of deletions
	    static int minimumNumberOfDeletions(String str) {
	       
	    	int n = str.length();
	 
	        // Find longest palindromic
	        // subsequence
	        int len = lps(str);
	 
	        // After removing characters
	        // other than the lps, we get
	        // palindrome.
	        return (n - len);
	    }
	 
	    // Driver Code
	    public static void main(String[] args) {
	        String str = "geeksforgeeks";
	        System.out.println("Minimum number " +"of deletions = "+minimumNumberOfDeletions(str));
	    }*/
	
	// Approcah 2
	
	public static int min(int x, int y)  {
	    return (x < y) ? x : y;
	}
	  
	// Utility function for calculating
	// Minimum element to delete
	public static int utility_fun_for_del(String str, int i, int j){
	    if (i >= j)
	        return 0;
	  
	    // Condition to compare characters
	    if (str.charAt(i) == str.charAt(j)){
	         
	        // Recursive function call
	        return utility_fun_for_del(str,
	                                   i + 1, j - 1);
	    }
	  
	    // Return value, incrementing by 1
	    return 1 + Math.min(utility_fun_for_del(str, i + 1, j), utility_fun_for_del(str, i, j - 1));
	}
	  
	// Function to calculate the minimum
	// Element required to delete for
	// Making string palindrome
	public static int min_ele_del(String str) {
	     
	    // Utility function call
	    return utility_fun_for_del(str, 0,
	                               str.length() - 1);
	}
	 
	// Driver Code
	public static void main(String[] args) {
	    String str = "abefbac";
	     
	    System.out.println("Minimum element of deletions = " +
	                       min_ele_del(str));
	}
	}
	

