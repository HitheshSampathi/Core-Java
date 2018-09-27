
public class Computer1 extends Thread
{
	CommonPrinter cp=null;
	public Computer1(CommonPrinter cp) 
	{
		this.cp = cp;
	}
	public void run()
	{
		cp.printData();
	}
}
class Computer2 extends Thread
{
	CommonPrinter cp=null;
	public Computer2(CommonPrinter cp) 
	{
		this.cp = cp;
	}
	public void run()
	{
		cp.printData();
	}
}
class Computer3 extends Thread
{
	CommonPrinter cp=null;
	public Computer3(CommonPrinter cp) 
	{
		this.cp = cp;
	}
	public void run()
	{
		cp.printData();
	}
}
