import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	System.out.println("main method started");

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a integer");
	
	int a =sc.nextInt();
	System.out.println("enter a double");
	double b =sc.nextDouble();
	System.out.println("enter a word");
	String c =sc.next();
	System.out.println("enter a sentence");
	String d =sc.nextLine();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println("main method ended");
	
}
}
