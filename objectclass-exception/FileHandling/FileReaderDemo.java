package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		File file = new File("D:/filedemo/Sample.text");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int size = (int) file.length();
			char[] chArr = new char[size];
			fileReader.read(chArr);
			/*for(char c : chArr) {
			 System.out.println(c);
	     }*/
           String msg = new String(chArr);
           //String msg = chArr.toString();
           System.out.println(msg);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		System.out.println("main method ended");

}
}