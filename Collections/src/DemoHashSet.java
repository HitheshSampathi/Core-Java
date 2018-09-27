import java.util.HashSet;

public class DemoHashSet {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(new Student("abc", 31, 99.6));
	hs.add(new Student("abc", 31, 99.6));
	hs.add(new Student("abc", 3, 99.6));
	hs.add(new Student("abc", 2, 99.6));
	for (Object obj : hs) {
		System.out.println(obj);
	}
	
}
}
