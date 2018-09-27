import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) {
	Employee e1=new Employee("abc", 23, 2063.25);
	String path="E:/cgjava/Employee.ser";
	File f=new File(path);
	FileInputStream fin=null;
	ObjectInputStream in=null;
	
	try {
		
		fin=new FileInputStream(f);
		in=new ObjectInputStream(fin);
		Object ob=in.readObject();
		System.out.println(ob);
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


}

