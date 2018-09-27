class Demo1{
	Demo1(){
		System.out.println("zero argument constructor");
	}
	Demo1(int a){
		System.out.println("int argument constructor");
	}
	Demo1(double a){
		System.out.println("double argument constructor");
	}
	Demo1(int a,double b){
		System.out.println("int and double argument constructor");
	}
	Demo1(double b,int a){
		System.out.println(" double and int argument constructor");
	}
}
public class Program5 {
public static void main(String[] args) {
	Demo1 d=new Demo1();
	new Demo1(96.72);
}
}
