interface Demo{
	void test();
}
class Sample implements Demo{

	@Override
	public void test() {
		System.out.println("providing implementation in sample");
	}
	
}
public class Program1 {
public static void main(String[] args) {
	Sample s1=new Sample();
	s1.test();
	
	Demo ref=()->
	{
		System.out.println("implementation in lambda expression");
	};
	ref.test();
	System.out.println(ref);
}
}
