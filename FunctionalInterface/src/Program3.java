interface Demo3{
	
	public int test(boolean res);
}
public class Program3 {
public static void main(String[] args) {
	Demo3 ref=(boolean res)->
	{
		System.out.println("test method");
		return 25;
	};
int a=	ref.test(false);
System.out.println(a);
}
}
