import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String[] args) {
	Employee e1=new Employee("abc", 23, 2063.25);
	String path="E:/cgjava/Employee.ser";
	File f=new File(path);
	FileOutputStream fout=null;
	ObjectOutputStream out=null;
	
	try {
		f.createNewFile();
		fout=new FileOutputStream(f);
		out=new ObjectOutputStream(fout);
		out.writeObject(e1);
		System.out.println("object written");
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
