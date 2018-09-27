import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet2 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student("java", 52, 25.32));
	ts.add(new Student("testing", 1, 99.32));
	ts.add(new Student("Frameworks", 92, 59.32));
	ts.add(new Student("j2ee", 62, 65.32));
	ts.add(new Student("sql", 22, 26.32));
	ts.add(new Student("html", 12, 45.32));
	ts.add(new Student("oracle", 2, 5.32));
	ts.add(new Student("webservices", 2, 15.32));
	System.out.println("default natural sorting");
	for (Object obj : ts) {
		System.out.println(obj);
	}
	Comparator c1=(Object ob1,Object ob2)->
	{
		Student st1=(Student)ob1;
		Student st2=(Student)ob2;
		return st1.id-st2.id;
	};
	
	TreeSet ts1=new TreeSet(c1);
	ts1.addAll(ts);
	System.out.println("**customized sorting**");
	for (Object obj : ts1) {
		System.out.println(obj);
	}
	TreeSet ts2=new TreeSet(new SortBasedOnName());
	ts2.addAll(ts);
	System.out.println("$$customized sorting$$");
	for (Object obj : ts2) {
		System.out.println(obj);
	}
}
}
