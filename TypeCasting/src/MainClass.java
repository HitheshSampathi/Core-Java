class Demo3 extends Demo2{
	int c=36;
	public void run() {
		System.out.println("executing run method");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		System.out.println("a="+d3.a);
		d3.disp();
		System.out.println("b="+d3.b);
		d3.test();
		System.out.println("c="+d3.c);
		d3.run();
		
		Demo2 d4=d3;
		System.out.println("a="+d4.a);
		d4.disp();
		System.out.println("b="+d4.b);
		d4.test();
		//System.out.println("c="+d4.c);
		//d4.run();
		
		
		Demo1 d5=d3;
		System.out.println("a="+d5.a);
		d5.disp();
		//System.out.println("b="+d5.b);
		//d5.test();
		//System.out.println("c="+d4.c);
		//d4.run();
		

	}

}
