import java.util.ArrayList;

public class Program4 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(12);//auto boxing & auto upcasting
	al.add('s');
	al.add(3.6f);
	al.add(true);
	for (Object obj : al)
	{
		//System.out.println(obj);
		if(obj instanceof Integer) {
			System.out.println("integer objects");
			Integer i=(Integer)obj;//downcasting
			System.out.println(i.toString());
			int i1=i;//auto unboxing
			System.out.println(i1);
		}
		else if(obj instanceof Character) {
			System.out.println("character objects");
			Character i=(Character)obj;//downcasting
			System.out.println(i.toString());
			char i1=i;//auto unboxing
			System.out.println(i1);
		}
		else if(obj instanceof Float) {
			System.out.println("float objects");
			Float i=(Float)obj;//down casting
			System.out.println(i.toString());
			float i1=i;//auto unboxing
			System.out.println(i1);
		}
		else {
			System.out.println(obj);
		}
	}
	
}
}
