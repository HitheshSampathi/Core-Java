
public class Program1 {

	public static void main(String[] args)
	{
		int a=14;
		System.out.println("a="+a);
		
		Integer i=new Integer(a);//boxing
		System.out.println(i);
		Integer i1=74;//auto-boxing
		System.out.println(i1.hashCode());
		Double b=4.3;
		System.out.println(b);
	}

}
