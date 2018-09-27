import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
public static void main(String[] args) {
	System.out.println("main method started");
	String path="E:/cgjava/filehandling.txt";
	File f=new File(path);
	FileWriter fw=null;
	try {
		fw=new FileWriter(f);
		fw.write("hithesh sampathi");
		fw.write("hithesh sampathi");
		fw.write("hithesh sampathi");
		fw.write("hithesh sampathi");
		System.out.println("data written");
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
