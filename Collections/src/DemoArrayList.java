import java.util.ArrayList;


public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("size="+al.size());
		al.add(new Student("abc", 31, 99.6));
		al.add(new Student("hjk", 23, 92.6));
		al.add(new Student("agc", 36, 39.6));
		al.add(new Student("def", 45, 69.6));
		al.add(new Student("ghj", 16, 49.6));
		al.add(new Student("mnb", 1, 98.6));
		al.add("java");
		al.add("java");
		al.add(null);	
		System.out.println("size="+al.size());
		
		/*for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}*/
		for (int i = 0; i < al.size(); i++)
		{
			Object ob=al.get(i);
			if(ob instanceof Student) {
				Student st=(Student)ob;//to access student properties
				System.out.print(st.id);
				System.out.print(st.name);
				System.out.println(st.marks);
		}else if(ob instanceof String) {
			String s=(String)ob;
			System.out.println(s);
		}else {
			System.out.println(ob);
		}
		
	}
}
}
