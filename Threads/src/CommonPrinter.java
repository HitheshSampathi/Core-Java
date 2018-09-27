
public class CommonPrinter {
synchronized public void printData() {
	for(int i=1;i<=5;i++) 
	{	
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName()+"i="+i);
		//System.out.println("i="+i);
		try {
			Thread1.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
}
