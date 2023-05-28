package SDET_Java_General_Programs;

public class Ovels_Consols {

	
	public static void main(String[] args) {
		
		
		String s=" I am Learning Selinium With Java";
		int vcount=0;
		int conso=0;
		String oc=s.toLowerCase();
		
		for(int i=0;i<oc.length();i++) {
			char ch=oc.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
				System.out.print(ch+" ");
			}
			
			else if(ch>='a'&& ch<='z') {
				conso++;
				ch=ch;
				System.out.print(ch+" ");
			}
		
		}
		System.out.println("");
		System.out.println("vovels :"+vcount+" ");
		System.out.println("conso:"+conso+" ");

	}

}
