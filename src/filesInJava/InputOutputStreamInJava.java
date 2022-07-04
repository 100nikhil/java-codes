package filesInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Two types of streams are there in java
 * 		Byte Stream (Raw type 01001001.....)             Char Stream (Modified Byte Stream (010)(0110)(101)...)
 * 
 * FileOutputStream, FileInputStream Classes deal with byte streams.
 * 
 * */

public class InputOutputStreamInJava {

	public static void main(String[] args) throws IOException {
		//creating file
		File f = new File("C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\test.txt");
		f.createNewFile();
		
		//writing to file
		FileOutputStream fout = new FileOutputStream(f,true); //passing true means appending
		char[] str = "\nThis is new file".toCharArray();
		for(char c: str) {			
			fout.write(c);
		}
		fout.close();
		
		//Reading from file
		int i;
		FileInputStream fin = new FileInputStream(f);
		do {
			i = fin.read();
			if(i != -1) {
				System.out.print((char)i);
			}
		}
		while(i != -1);
		fin.close();
	}

}
