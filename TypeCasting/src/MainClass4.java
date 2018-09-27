class Sample4{
	int a=19;
}
class Sample5 extends Sample4{
	int b=23;
}
public class MainClass4 {
public static void main(String[] args) {
	Sample4 s4=new Sample5();//upcasting
	System.out.println(s4.a);
	Sample5 s5=(Sample5)s4;//downcasting
	System.out.println(s5.b);
	
}
}
