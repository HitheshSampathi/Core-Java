class Program{
	public void test(){
		System.out.println("executing test method");
	}
	public void test( int a){
		System.out.println("executing int argtest method");
	}
	public void test(double a){
		System.out.println("executing double arg test method");
	}
}
public class MainClass {
public static void main(String[] args) {
	Program p=new Program();
	p.test();
	p.test(5);
	p.test(78.23);
}
}
