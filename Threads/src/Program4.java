
public class Program4 {
public static void main(String[] args) {
	System.out.println("main method started");
	Thread t1=Thread.currentThread();
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	t1.setName("thread");
	t1.setPriority(8);
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	System.out.println("main method ended");
}
}
