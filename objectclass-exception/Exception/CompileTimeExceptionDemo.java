package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionDemo {

	private static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader file = new FileReader("E:\\java.txt");
		reader = new BufferedReader(file);
		System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
