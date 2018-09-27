import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DemoBufferedReader {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		String path="E:/cgjava/filehandling.txt";
		File f=new File(path);
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String st=br.readLine();
			//System.out.println(st);
			while(st!=null) {
				System.out.println(st);
				st=br.readLine();
			}
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


