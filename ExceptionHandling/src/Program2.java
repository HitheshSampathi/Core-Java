import java.util.InputMismatchException;
import java.util.Scanner;
public class Program2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int div=a/b;
		System.out.println(div);
	}catch(ArithmeticException ref) {
		System.out.println("cannot divide");
		System.out.println("exception handled"+ref);
	}catch(InputMismatchException ref) {
		System.out.println("cannot divide");
		System.out.println("exception handled"+ref);
	}catch(Exception ref) {//generic exception handlers
		System.out.println("cannot divide");
		System.out.println("exception handled"+ref);
	}
	System.out.println("main method ended");
}
}
