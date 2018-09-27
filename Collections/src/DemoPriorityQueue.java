import java.util.Comparator;
import java.util.PriorityQueue;


public class DemoPriorityQueue {
public static void main(String[] args) {
	PriorityQueue ts=new PriorityQueue();
	ts.add(new Student("java", 52, 25.32));
	ts.add(new Student("testing", 1, 99.32));
	ts.add(new Student("Frameworks", 92, 59.32));
	ts.add(new Student("j2ee", 62, 65.32));
	ts.add(new Student("sql", 22, 26.32));
	ts.add(new Student("html", 12, 45.32));
	ts.add(new Student("oracle", 2, 5.32));
	ts.add(new Student("webservices", 2, 15.32));
	System.out.println("default natural sorting");
	int a= ts.size();
	for (int i = 0; i <a; i++) {
		System.out.println(ts.poll());
	}
	Comparator c1=(Object ob1,Object ob2)->
	{
		Student st1=(Student)ob1;
		Student st2=(Student)ob2;
		return st1.id-st2.id;
	};
	
	PriorityQueue ts1=new PriorityQueue(c1);
	ts1.addAll(ts);
	System.out.println("**customized sorting**");
	int a1= ts.size();
	for (int i = 0; i <a1; i++) {
		System.out.println(ts.poll());
	}
	PriorityQueue ts2=new PriorityQueue(new SortBasedOnName());
	ts2.addAll(ts);
	System.out.println("$$customized sorting$$");
	int a3= ts.size();
	for (int i = 0; i <a3; i++) {
		System.out.println(ts.poll());
	}
	}
}

