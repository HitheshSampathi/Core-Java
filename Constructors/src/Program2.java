class Sample{
	int a;
	String s;
	boolean bool;
	Sample()
	{
		System.out.println("executing constructor");
		a=34;
		s="java";
		bool=true;
	}
}
public class Program2 {
public static void main(String[] args) {
	Sample s1=new Sample();
	System.out.println("a="+s1.a);
	System.out.println("s="+s1.s);
	System.out.println("s1="+s1.bool);
	
	Sample s2=new Sample();
	System.out.println("a="+s2.a);
	System.out.println("s="+s2.s);
	System.out.println("s1="+s2.bool);
}
}

