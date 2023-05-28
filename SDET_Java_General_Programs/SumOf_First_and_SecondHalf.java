package SDET_Java_General_Programs;

public class SumOf_First_and_SecondHalf {
	
    public static void sumofFirstandSecondHalf(int a[], int n){
       
	 int firsthalfsum = 0, secondhalfsum = 0;
        
        for (int i=0; i<n; i++){
            if(i<n/2){
                firsthalfsum +=a[i];
            }
            else{
                secondhalfsum += a[i];
            }
        }
        System.out.println(firsthalfsum);
        System.out.println(secondhalfsum);
        
    }
  
	public static void main(String[] args) {
		int a[]={4,5,3,6,8,9,10,2};
		int n =a.length;
		sumofFirstandSecondHalf(a, n);
		
		
		System.out.println("Hello World");
	}
}
