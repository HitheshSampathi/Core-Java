
public class MainClass5 {
public static void main(String[] args) {
	Demo1 d1=new Demo3();//upcasting
	System.out.println(d1.a);
	d1.disp();
	
	Demo2 d2=(Demo2)d1;//downcasting
	System.out.println(d2.a);
	d2.disp();
	System.out.println(d2.b);
	d2.test();
	
	Demo3 d3=(Demo3)d1;//downcasting
	System.out.println(d3.a);
	d3.disp();
	System.out.println(d3.b);
	d3.test();
	System.out.println(d3.c);
	d3.run();
	
	
	
	
}
}
