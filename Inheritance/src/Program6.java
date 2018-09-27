class Sample1
{
	int a=23;
}
class Sample2 extends Sample1{
	int a=34;
	void disp(){
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class Program6 {
public static void main(String[] args) {
	Sample2 ref=new Sample2();
	ref.disp();
}
}
