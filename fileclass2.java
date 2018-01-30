package class8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileclass2 {
public static  void main(String [] args) throws IOException{
		
		File file2 = new File("C:\\Users\\RISHIKA\\eclipse-workspace\\class8_filehandling\\src\\class8\\abc.txt");
		
		FileReader in = new FileReader(file2);
		
		int a;
		
		while((a=in.read())!=-1) {
			System.out.print((char)a);
		}
		
		
	}

}
