package SDET_Java_General_Programs;

public class Find_Duplicate_Element_inthe_String {

	public static void main(String[] args) {
		
		String str="Selinium Java is a Automation Tool";
		
		int count=0;
		
		char a[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
		count=1;
		
			for(int j=i+1;j<str.length();j++) {
			
				if(a[i]==a[j]&&a[j]!=' ') {
				count++;
				a[j]=0;			
		}		
	}
			if(count>1 && a[i]!='0') {
				System.out.print(a[i]);
			}
			
	}

}
}