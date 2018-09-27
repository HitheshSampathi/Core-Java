class Sample1{
	int a=365;
}
public class Program5 {
	
public static boolean test1(double b){
	System.out.println("executing test1");
	return 2>5;
}
public static Sample1 test2(){
	System.out.println("executing test2");
	return new Sample1();//returning reference to a called method
}
public static void main(String[] args) {
	boolean b=test1(89.26);
	System.out.println(b);
	Sample1 s=test2();
	System.out.println("a="+s.a);
}

}
