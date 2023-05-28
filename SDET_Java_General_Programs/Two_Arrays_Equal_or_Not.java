package SDET_Java_General_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Two_Arrays_Equal_or_Not {

	public static void main(String[] args) {
	
		int a[]= {2,4,5,6,7,8};
		int b[]= {2,4,5,6,7,8};
		
		boolean status=Arrays.equals(a, b);
		if(status==true) {
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("both arrays are not equal");
		}
	}

}
