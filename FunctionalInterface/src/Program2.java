interface Demo1{
	static void run() {
		System.out.println("run method");
	}
	default void test() {
		System.out.println("test method");
	}
	 void disp(String s1,int password);
}

public class Program2 {
public static void main(String[] args) {
	
Demo1 ref=(String s1,int password)->
{
	System.out.println("executing disp method");
	System.out.println(s1);
	System.out.println(password);
};
ref.disp("java", 1234);
Demo1.run();
ref.test();

}

}
