class Thread1 extends Thread
{

	
	public void run() {
		for(int i=1;i<=5;i++) 
		{
			System.out.println("i="+i);
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Program2 {
public static void main(String[] args) {
	System.out.println("mainmethod started");
	Thread1 t1=new Thread1();
	t1.start();
	Thread1 t2=new Thread1();
	t2.start();
	
	System.out.println("main method ended");
}
}
