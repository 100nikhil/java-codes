package filesInJava;

import java.io.File;
import java.util.Date;

public class ChekingAFile {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\899716\\OneDrive - Cognizant\\Desktop\\utility.txt");
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		System.out.println((new Date().getTime()-f1.lastModified())/(1000*3600)+" hours ago modified");
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
	}

}
