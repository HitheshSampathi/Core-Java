class Demo2{
	char ch='j';
	public void test(){
		System.out.println("test method");
	}
}
public class Program5 {
public static void main(String[] args) {
	new Demo2().test();
	System.out.println("ch="+new Demo2().ch);
	new Demo2().ch='a';
	System.out.println("ch="+new Demo2().ch);
}
}
