
public class Program5 {
public static void main(String[] args) {
	CommonPrinter cp=new CommonPrinter();
	Computer1 c1=new Computer1(cp);
	Computer2 c2=new Computer2(cp);
	Computer3 c3=new Computer3(cp);
	c1.start();
	c2.start();
	c3.start();
}
}
