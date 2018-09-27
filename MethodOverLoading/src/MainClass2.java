class Program2{
	 public int test(){
		System.out.println("executing test method");
		return 10;
	}
}
class Program3 extends Program2  {
	public static void test(int a){
		System.out.println("executing static test method");
	}
}
public class MainClass2 {
public static void main(String[] args) {
	Program3 p3=new Program3();
	p3.test();
	Program3.test(6);
	
	
}
}
