package SDET_Java_General_Programs;

public class Largest_Number_and_Smallest_Number {

	public static void main(String[] args) {
		 int[] numbers = {5, 10, 3, 8, 1,20};

	        // Initialize the variables with the first element of the array
	        int smallest = numbers[0];
	        int largest = numbers[0];

	        // Iterate through the array
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        // Print the results
	        System.out.println("Smallest number: " + smallest);
	        System.out.println("Largest number: " + largest);
	    }
	}

