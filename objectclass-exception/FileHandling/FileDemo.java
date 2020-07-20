package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		  File file = new File("D:/filedemo/Sample.text");
		  try {
			  if(file.exists()) {
				  System.out.println("File alerady exists");
				  file.delete();
				  System.out.println("File deleted...");
			  } else {
				  file.createNewFile();
				  System.out.println("File created successfully");
			  }
		  } catch (IOException e) {
			  e.printStackTrace ();
		  }
		  System.out.println("main method ended");
	}

}
