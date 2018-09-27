class Student1{
	String name;
	int id;
	double marks;
	Student1(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		System.out.println("this="+this);
	}
}
public class Program4 {
public static void main(String[] args) {
	Student1 s1=new Student1(123, "java", 99.29);
	System.out.println("id="+s1.id);
	System.out.println("name="+s1.name);
	System.out.println("marks="+s1.marks);
	System.out.println("s1="+s1);
	
	Student1 s2=new Student1(456, "mava", 90.29);
	System.out.println("id="+s2.id);
	System.out.println("name="+s2.name);
	System.out.println("marks="+s2.marks);
	System.out.println("s2="+s2);
	
}
}