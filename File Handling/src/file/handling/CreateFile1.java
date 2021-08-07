package file.handling;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:FileNew.doc");
		try {
			if(f.createNewFile()) {
				System.out.println(f.getName()+ " is created");
			}
			else {
				System.out.println("File is already existing.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
