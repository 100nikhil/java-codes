package filesInJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterInJava {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\test.txt"));
		int ch;
		while((ch = bf.read()) != -1) {
			System.out.print((char)ch);
		}
		bf.close();
		
		BufferedWriter bf1 = new BufferedWriter(new FileWriter("C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\test.txt", true), 1);
		bf1.append("\nWriting using buffered-writer");
		bf1.close();
	}
	//new FileWriter("C://....", true)   HERE BY PASSING TRUE WE OPENED FILEWRITER IN APPEND MODE
	//new FileWriter("C://....")   NORMAL MODE
}
