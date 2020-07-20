package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main method started ");
         File file = new File("D:/filedemo/Sample.text");
         FileWriter fileWriter = null;
		try {
        	 fileWriter = new FileWriter(file);
        	 fileWriter.write("hello,welcome to file handling");
        	 fileWriter.flush();
         } catch (IOException e) {
        	 e.printStackTrace();
         } finally {
        	 try {
        		 fileWriter.close();
        	 }  catch (IOException e) {
        		 e.printStackTrace();
        		 
        	 }
         }
		System.out.println("main method ended");
	}

}
