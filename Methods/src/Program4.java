class Sample{
	int a=35;
}
public class Program4 {
	
public static void test1(double b){
	System.out.println("executing test1");
}
public static void test2(Sample s1){
	System.out.println("executing test2");
	System.out.println("a="+s1.a);
}
public static void main(String[] args) {
	test1(89.26);
	test2(new Sample());//passing reference to a method
}

}
