import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreemap {
public static void main(String[] args) {
	TreeMap tm=new TreeMap();
	tm.put("java", new Student("name", 14, 4.3));
	tm.put("java", new Student("name1", 149, 64.3));
	tm.put("j2ee", new Student("name2", 15, 49.3));
	tm.put("sql", new Student("name3", 10, 40.3));
	Set s1=tm.keySet();
	for (Object obj : s1) {
		System.out.println(obj);
		System.out.println(tm.get(obj));
	}
}
}
