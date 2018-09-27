class Demo3{
	char ch='j';
	public void test(){
		System.out.println("test method");
	}
}
public class Program6 {
public static void main(String[] args) {
	Demo3 ref=new Demo3();
	ref.test();
	System.out.println("ch="+ref.ch);
	ref.ch='a';
	System.out.println("ch="+ref.ch);
}
}
