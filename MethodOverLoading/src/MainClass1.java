class Program1{
	public void test(){
		System.out.println("executing test method");
	}
	public static void test( int a){
		System.out.println("executing int argtest method");
	}
	public int test(boolean c){
		System.out.println("executing test method with return");
		return 10;
		
	}
}
public class MainClass1 {
public static void main(String[] args) {
	Program1 p=new Program1();
	p.test();
	Program1.test(5);
	int d=p.test(true);
	System.out.println(d);
	
}
}
