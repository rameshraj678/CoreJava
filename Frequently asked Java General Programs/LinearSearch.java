package SDET_Java_General_Programs;

public class LinearSearch {
	
public static void main(String[] args) {
	
	
	int a[]= {10,20,40,59,90};	
	boolean flag=false;
	int search_ele=59;
	
	for(int i=0;i<a.length;i++) {

		//		System.out.println(a[i]);		//  avalible array list will display
		
		if(search_ele==a[i]) {
			System.out.println("Element is found:"+a[i]);
			flag=true;
		}		
	}
	if(flag==false) {
		
		System.out.println("Element is not found");
	}
	
}
}
