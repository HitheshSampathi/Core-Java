import java.io.IOException;
import java.sql.SQLException;

class Demo{
	public void test() throws IOException,SQLException,InterruptedException
	{
		System.out.println("executing test method");
	}
}
public class Program5 {
public static void main(String[] args) 
{
	
		try {
			new Demo().test();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}


}
}
