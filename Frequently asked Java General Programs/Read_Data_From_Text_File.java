package SDET_Java_General_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class Read_Data_From_Text_File {

	public static void main(String[] args) throws FileNotFoundException  {
	
		FileReader fr= new FileReader("C:\\Users\\91949\\eclipse-workspace\\Core_Java\\src\\Text.txt");
		BufferedReader br= new BufferedReader(fr);
		
		String str;
		try {
		
			while((str=br.readLine())!=null){
			
			System.out.println(str);
		}
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}

}
/*next(): This method reads the next token from the input as a String. 
				The token is defined as a sequence of non-whitespace characters.

nextInt(): This method reads the next token from the input as an int.

nextDouble(): This method reads the next token from the input as a double.

nextLine(): This method reads the next line of input as a String.

hasNext(): This method returns true if there is another token in the input, 
    			  and false otherwise.

hasNextInt(): This method returns true if the next token in the input can be 
					 interpreted as an int, and false otherwise.

hasNextDouble(): This method returns true if the next token in the input can	
	 						be interpreted as a double, and false otherwise.

useDelimiter(String pattern): This method sets the delimiter to use for
			 tokenizing input. The default delimiter is
			 whitespace.		*/