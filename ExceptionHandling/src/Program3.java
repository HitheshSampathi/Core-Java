
public class Program3 {
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("entering try block");
			int a=1/0;
			System.out.println("exiting tey block");
		}catch(ClassCastException ref) {
			System.out.println("Exception handled"+ref);
			return ;
		}finally {
			System.out.println("close connection");
		}
		System.out.println("main method started ");
	}
}
