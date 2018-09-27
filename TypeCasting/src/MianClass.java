class Sample1{
	int a=32;
}
class Sample2 extends Sample1{
	int b=25;
}
public class MianClass {

	public static void main(String[] args) {
	Sample1 s1=new Sample1();
	Sample2 s2=new Sample2();
	
	Sample1 s3=new Sample2();//upcasting
	System.out.println(s3.a);
	//System.out.println(s3.b); error
	Sample2 s4=(Sample2)s3;//downcasting
	System.out.println(s4.a);
	System.out.println(s4.b);
	}

}
