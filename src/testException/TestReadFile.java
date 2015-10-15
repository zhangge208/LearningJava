package testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
	public static void main(String[] args) {
		FileReader reader = null;	
		try {
				reader = new FileReader("d:/a.txt");
				char c = (char) reader.read();
				char c1 = (char) reader.read();
				System.out.println(c + c1);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally { 
				try {
					if (reader != null) {
						reader.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
	
	}
}
