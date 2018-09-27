import java.util.TreeSet;

public class DemoTreeSet {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student("abc", 31, 99.6));
	ts.add(new Student("hjk", 23, 92.6));
	ts.add(new Student("agc", 36, 39.6));
	ts.add(new Student("def", 45, 69.6));
	ts.add(new Student("ghj", 16, 49.6));
	ts.add(new Student("mnb", 1, 98.6));
	for (Object obj : ts) {
		System.out.println(obj);
	}
}
}
