package SDET_Java_General_Programs;

public class Count_Occurrences_of_a_Character_in_a_String {

	public static void main(String[] args) {
		
// Approach 1 particular charcter how many times come aganin  using methods
		
		String str="Java programs and opps concepts";
		
//		int totalcount=str.length();
//		
//		int after_remove_letter=str.replaceAll("a", "").length();
//		
//		int count=totalcount-after_remove_letter;
//		
//		System.out.println("Number of Occurrences of a:"+count);
		
		
// Approach 2	using for loop
		
		char ch='a';
		int count =0;
		
		for(int i=0;i<str.length();i++ ) {
			if(str.charAt(i)==ch) {
				count++;
				
			}
		}
		
//		System.out.println("number of times repeacted chracter of :a=" +count);
		
		System.out.println("The character '" + ch + "' found " + count + " times in a string ''" + str + "''.");
		
		
	}

}
