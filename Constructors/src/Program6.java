class Demo2{
	Demo2(){
		System.out.println("zero argument constructor");
	}
	Demo2(int a){
		this();
		System.out.println("int argument constructor");
	}
	Demo2(double a){
		this(25);
		System.out.println("double argument constructor");
	}
	
}
public class Program6 {
public static void main(String[] args) {
	Demo2 d=new Demo2(99.29);
	
}
}
