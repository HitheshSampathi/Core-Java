class Sample{
	static int a=32;
	double b=15.7;
}
public class Program1 {
public static void main(String[] args) {
	Sample s1=new Sample();
	System.out.println(s1);
	s1=new Sample();//dereferencing the object
	System.out.println(s1);
	s1=null;//dereferencing the object
	System.out.println(s1);
}
}
