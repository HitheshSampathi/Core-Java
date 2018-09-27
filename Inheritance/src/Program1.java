class DemoApp{	//single level inheritance
	void login()
	{
		System.out.println("login");
	}
	void logout()
	{
		System.out.println("logout");
	}
}
class DemoApp2 extends DemoApp{
	
}
public class Program1 {
public static void main(String[] args) {
	DemoApp2 ref= new DemoApp2();
	ref.login();
	ref.logout();
}
}
