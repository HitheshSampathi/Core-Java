
public class Program3 {

	public static void login(boolean res){
			
		if(res==true){
			System.out.println("valid credentails login page");
		}
		else
		{
			System.out.println("invalid credentials error !");
		}
	}
	public static boolean validate(String s1,int password)
	{
		if(s1=="java"&&password==1234){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		boolean b=validate("java",1234);
		login(b);
		boolean b1=validate("sql",8765);
		login(b1);
		System.out.println("main method ended");
	}
}
