package file.handling;

import java.io.File;

public class FileInfo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:FileNew.doc");
		if(f.exists()) {
			System.out.println("Name : "+f.getName());
			System.out.println("Write : "+f.canWrite());
			System.out.println("Read : "+f.canRead());
			System.out.println("Path : "+f.getAbsolutePath());
			System.out.println("Size : "+f.length());
		}
	}

}
