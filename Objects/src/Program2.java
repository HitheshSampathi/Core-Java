class Sample1{
	static int a=32;
	double b=15.7;
}
public class Program2 {
public static void main(String[] args) {
	 Sample1 s2=new Sample1();
	 Sample1 s3=s2;
	 Sample1 s4=s3;
	 //one object having multiple reference variables
	 s4.b=99.99;
	 System.out.println(s2.b);
	 
	 
}
}
