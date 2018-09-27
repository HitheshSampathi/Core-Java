class Program1{
	public void display() {
		System.out.println("testing");
	}
}
class Program2 extends Program1{
	int a=35;
	public void display() {
		System.out.println("development");
	}
}
public class MainClass {
public static void main(String[] args) {
	Program1 ref=new Program2();//upcasting
	ref.display();
	
}
}
