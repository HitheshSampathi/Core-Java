
public class Operators {

	public static void main(String[] args) {
		
		//unary operators
		int a=5;
		System.out.println(++a);
		System.out.println(a);
		int b=3;
		System.out.println((++b)+(++b));
		System.out.println(b);
		
		//arithematic operators
		byte c=1;
		byte d=2;
		//byte e=c+d; error 
		int e=c+d;
		System.out.println(e);
		
		float a1=0.1f;
		long b1=1;
		
	//	long sum=a1+b1; error since float is bigger than long in precedence
		
		float sum=a1+b1;
		System.out.println(sum);
		
		int c1=5;
		int c2=2;
		int c3=c1/c2;
		System.out.println(c3);
		
		
		//relational operators
		
		boolean bool=5<2;
		System.out.println(bool);
		
	}
}
