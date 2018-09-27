class Student{
	String name;
	int id;
	double marks;
	Student(int id1,String name1,double marks1){
		id=id1;
		name=name1;
		marks=marks1;
	}
}
public class Program3 {
public static void main(String[] args) {
	Student s1=new Student(123, "java", 99.29);
	System.out.println("id="+s1.id);
	System.out.println("name="+s1.name);
	System.out.println("marks="+s1.marks);
	
	Student s2=new Student(456, "mava", 90.29);
	System.out.println("id="+s2.id);
	System.out.println("name="+s2.name);
	System.out.println("marks="+s2.marks);
	
}
}
