package file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File("D:FileNew.doc");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
	}

}
