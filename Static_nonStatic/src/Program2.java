class Demo{
	
	static char ch='j';
	public static void test(){
		System.out.println("test method");
	}
}
public class Program2 {
public static void main(String[] args) {
	Demo.test();
	System.out.println("ch="+Demo.ch);
}
}
