class Demo{
	int a;
	Demo(){//constructor
		a=34;
		System.out.println("constructor");
	}
}
public class Program1 {
public static void main(String[] args) {
	System.out.println("main method started");
	Demo ref=new Demo();
	System.out.println("a="+ref.a);
}
}
