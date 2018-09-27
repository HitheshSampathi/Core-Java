
public class Program5 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("string");
	System.out.println(sb);
	sb.append("java");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	System.out.println(sb.hashCode());
}
}
