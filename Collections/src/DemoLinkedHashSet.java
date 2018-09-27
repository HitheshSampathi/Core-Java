import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(new Student("abc", 31, 99.6));
	hs.add(new Student("abc", 31, 99.6));
	hs.add(new Student("abc", 3, 99.6));
	hs.add(new Student("abc", 2, 99.6));
	for (Object obj : hs) {
		System.out.println(obj);
	}
	
}
}
