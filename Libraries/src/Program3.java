class Student1{
	String name;
	int id;
	double marks;
	public Student1(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.marks = salary;
	}
	@ Override
	public String toString() {
		return this.id+" "+this.name+" "+this.marks;
		
	}
	@Override
	public int hashCode() {
	return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student1 st=(Student1)obj;
		return this.id==st.id;
		
	}
	
}
public class Program3 {
public static void main(String[] args) {
	Student1 st1=new Student1("abc", 123, 35);
	System.out.println("s1.toString()="+st1.toString());
	System.out.println("s1="+st1);
	
	Student1 st2=new Student1("abc", 123, 35);
	System.out.println("s2.toString()="+st2.toString());
	System.out.println("s2="+st2);
	
	System.out.println(st1.hashCode());
	System.out.println(st2.hashCode());
	System.out.println(st1.equals(st2));
	System.out.println(st1==st2);
	
	
	
	
	
	
	
}	
	
}