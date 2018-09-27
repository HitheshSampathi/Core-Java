class Vehicle		//hierarchical inheritance
{
	int a;
}
class TwoWheeler extends Vehicle
{
	int b;
}
class ThreeWheeler extends Vehicle
{
	int c;
}
public class Program4
{
	public static void main(String[] args) 
	{
	ThreeWheeler ref=new ThreeWheeler();
	System.out.println(ref.a);
	}
}
