import java.util.HashMap;

public class DemoHashMap {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("java", new Student("name", 14, 4.3));
	hm.put("java", new Student("name1", 149, 64.3));
	hm.put("j2ee", new Student("name2", 15, 49.3));
	hm.put("sql", new Student("name3", 10, 40.3));
	Object ob=hm.get("java");
	System.out.println(ob);
	
	Object ob2=hm.get("sql");
	System.out.println(ob2);
	
	Object ob1=hm.get("j2ee");
	System.out.println(ob1);
}
}
