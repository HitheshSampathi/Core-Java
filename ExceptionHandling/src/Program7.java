import java.sql.SQLException;

class Demo5 {
	public void getConnection(String username,String password) throws SQLException {
		System.out.println("pass the username and passsword");
		if(username.equals("abc")&&(password.equals("1234"))) {
			System.out.println("connection establised");
		}
		else {
			throw new SQLException();
		}
	}
}
public class Program7 {
public static void main(String[] args) {
	try
	{
	new Demo5().getConnection("abc", "1234");
	}
	catch(SQLException e) {
	e.printStackTrace();
	}
}
}
