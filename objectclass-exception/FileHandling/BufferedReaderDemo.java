package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		FileReader fileReader = null;
		BufferedReader reader = null;
		try {
			fileReader = new FileReader("D:/filedemo/Sample.text");
			reader = new BufferedReader(fileReader);
			String mesg = null;
			while((mesg=reader.readLine())!=null) {
				System.out.println(mesg);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");
		

	}

}
