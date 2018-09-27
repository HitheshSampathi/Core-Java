class Student{
	String name;
	int id;
	double salary;
	public Student(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@ Override
	public String toString() {
		return this.id+" "+this.name+" "+this.salary;
		
	}
}
public class Program2 {
public static void main(String[] args) {
	Student s1=new Student("abc", 123, 15000);
	System.out.println(s1);
	System.out.println(s1.toString());
	
	Student s2=new Student("ghi", 983, 1000);
	System.out.println(s2);
	System.out.println(s2.toString());
}
}
