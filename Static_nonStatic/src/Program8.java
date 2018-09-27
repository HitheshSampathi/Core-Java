class Sample{
	static int a=12;
	double b=98.99;
	
}
public class Program8 {
public static void main(String[] args) {
	Sample s=new Sample();
	System.out.println(s.a);//Accessing static with reference variable it is not recommended
	System.out.println(s.b);
}
}
 