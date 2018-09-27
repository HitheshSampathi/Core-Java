import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
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
		al.remove(3);
		al.remove();//removes head element
		System.out.println("size="+al.size());
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
}
}

