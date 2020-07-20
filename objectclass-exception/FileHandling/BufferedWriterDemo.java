package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		FileWriter fileWriter = null;
		BufferedWriter buffWriter = null;
		
       try {
    	   fileWriter = new FileWriter("D:/filedemo/Sample.text");
    	   buffWriter = new BufferedWriter(fileWriter);
    	   buffWriter.write("Buffered Writer Demo\r\n");
    	   buffWriter.write("Buffered Writer Demo\r\n");
    	   buffWriter.write("Buffered Writer Demo\r\n");
    	   buffWriter.flush();
       } catch (IOException e) {
    	   e.printStackTrace();
       } finally {
    	   try {
    		   buffWriter.close();
    		   fileWriter.close();
    	   } catch (IOException e) {
    		   e.printStackTrace();
    	   }
       }
       System.out.println("main method endedss");
	}

}
