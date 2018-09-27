class Thread2 implements  Runnable
{
	public void run()
	{
		for(int i=5;i>=1;i--) 
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
public class Program3 {
public static void main(String[] args) {
	System.out.println("main method started");
	Thread2 t2=new Thread2();
	Thread ref=new Thread(t2);
	ref.start();
	Runnable r1=()->
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("i="+i);
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	};
	Thread ref2=new Thread(r1);
	
	ref2.start();
	System.out.println("main method ended");
}
}
