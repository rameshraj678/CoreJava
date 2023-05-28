package HighLevel_Programs_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
			
public class Find_largest_word_in_dictionary {
			
				static String res="";
			    
		static void check(String d,String s){
			 
			        int i = 0;
			        int j = 0;
			        while(i < d.length() && j < s.length()){
			     
			            if(d.charAt(i) == s.charAt(j)){
			                i += 1;
			                j += 1;
			            }
			            else
			                j += 1;
			     
			            if(i == d.length() && res.length() < d.length()){
			                res = d;
			            }
			        }
			    }
			     
		static String LongestWord(ArrayList<String>d,String S){
			     
			        // sort the dictionary word
			        // for smallest lexicographical order
			        Collections.sort(d);
			     
			        for(String c:d){
			            check(c,S);
			        }
			         
			        return res;
			    }
			     
			// Drivers code
			public static void main(String args[]){
			         
			    ArrayList<String>dict = new ArrayList<String>(Arrays.asList( "ale", "apple", "monkey", "plea"));
			    String str = "abpcplea";
			    System.out.println(LongestWord(dict, str));
			}
			}
