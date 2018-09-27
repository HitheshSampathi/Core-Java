class Sample{//upcasting using method arguments
	public void start(Demo1 d1) {
		System.out.println("executing start2 method");
		System.out.println("a="+d1.a);
		d1.disp();
	//	System.out.println("b="+d1.b);
	//	d1.test();
		//System.out.println("c="+d2.c);
		//d2.run();
	}
	public void start1(Demo2 d2) {
		System.out.println("executing start2 method");
		System.out.println("a="+d2.a);
		d2.disp();
		System.out.println("b="+d2.b);
		d2.test();
		//System.out.println("c="+d2.c);
		//d2.run();
	}
	public void start2(Demo3 d3) {
		System.out.println("executing start2 method");
		System.out.println("a="+d3.a);
		d3.disp();
		System.out.println("b="+d3.b);
		d3.test();
		System.out.println("c="+d3.c);
		d3.run();
	}
}
public class MainClass3 {
public static void main(String[] args) {
	Sample s1=new Sample();
	s1.start(new Demo1());
	s1.start(new Demo2());//upcasting
	s1.start(new Demo3());//upcasting
	
	s1.start1(new Demo2());
	s1.start1(new Demo3());//upcasting
	
	s1.start2(new Demo3());
	
}
}
