
public class Program3 {
public static void main(String[] args) {
	String s1="java";
	System.out.println("s1="+s1);
	String s2=new String("java");
	System.out.println("s2="+s2);
	String s3="java";
	System.out.println("s3="+s3);
	System.out.println(s1==s3);
	String s4=new String("java");
	System.out.println("s4="+s4);
	System.out.println(s2==s4);
	String s5="ja";
	String s6="va";
	String s7=s5+s6;
	System.out.println(s7);
	System.out.println(s1==s7);
	String s8="ja"+"va";
	System.out.println(s1==s8);
}
}
