import java.io.File;
import java.io.IOException;

public class DemoFile1 {
public static void main(String[] args) {
	System.out.println("main method started");
	String path="E:/cgjava/filehandling.txt";
	File f=new File(path);
	try {
		boolean res=f.createNewFile();
		System.out.println("file created="+res);
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("main method ended");
}
}
