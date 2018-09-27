
 class Program {
static String s1="java";
int a=23;
public static void test(int d,String s2){
	double b=23.8;//local variable
	System.out.println(b);
}
}
public class Program7{
	public static void main(String[] args) {
		System.out.println(Program.s1);
		Program.test(34, "sql");
		Program ref=new Program();
		System.out.println(ref.a);
		
	}
}
