package file.handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
		     FileWriter fwrite = new FileWriter("D:FileNew.doc");  
		     // writing the content into the FileOperationExample.txt file  
		     fwrite.write("UST global");   
		   
		     // Closing the stream  
		     fwrite.close();   
		     System.out.println("Content is successfully wrote to the file.");  
		 }catch (IOException e) {  
		     System.out.println("Unexpected error occurred");  
		     e.printStackTrace();  
		 }  

	}

}
