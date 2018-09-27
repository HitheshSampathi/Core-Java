
public class Program4 {
int a=12;
public void display(){
	System.out.println("disp method");
}
public static void main(String[] args) {
	System.out.println("main method started");
	new Program4().display();
	System.out.println("a="+new Program4().a);
	System.out.println("main method ended");
	
}
}
