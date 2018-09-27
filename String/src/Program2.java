
public class Program2 {
public static void main(String[] args) {
	String s1="A";
	System.out.println("s1="+s1);
	String s2=new String();
	System.out.println("s2="+s2);
	String s3=new String("sql");
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	System.out.println(s2.toString());
	
	String s4=new String("sql");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	
}
}
