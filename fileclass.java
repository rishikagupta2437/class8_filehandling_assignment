package class8;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class fileclass {
	
	public static  void main(String [] args) throws IOException{
		
		File file = new File("C:\\Users\\RISHIKA\\eclipse-workspace\\class8_filehandling\\src\\class8\\input.txt");
		
		FileReader in = new FileReader(file);
		
		int a;
		
		while((a=in.read())!=-1) {
			System.out.print((char)a);
		}
		
		
	}

}
