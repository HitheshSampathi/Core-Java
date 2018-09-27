import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
public static void main(String[] args) {
	System.out.println("main method started");
	String path="E:/cgjava/filehandling.txt";
	File f=new File(path);
	FileReader fr=null;
	try {
		fr=new FileReader(f);
		int a=fr.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a=fr.read();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
