
public class Program2 {

	public static void login(String s1,int password){
		System.out.println(s1);
		System.out.println(password);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		login("java",1234);
		login("sql",3456);
		System.out.println("main method ended");
	}
}
