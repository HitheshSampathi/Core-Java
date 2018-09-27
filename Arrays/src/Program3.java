
public class Program3 {
public static void main(String[] args) {
	System.out.println("main method started");
	Student[] st=new Student[5];
	Student s1=new Student("ABC", 12, 99.25);
	st[0]=s1;
	st[1]=new Student("bcd", 65, 395.23);
	st[2]=new Student("fhd", 25, 95.23);
	st[3]=new Student("yud", 35, 35.23);
	for (int i = 0; i < st.length; i++) {
		System.out.println(st[i]);
	}
	System.out.println("main method ended");
}
}
