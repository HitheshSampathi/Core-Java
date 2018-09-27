
public class Student implements Comparable {
String name;
int id;
double marks;
public Student(String name, int id, double marks) {
	this.name = name;
	this.id = id;
	this.marks = marks;
}
@Override
public String toString() {
	
	return this.name+" "+this.id+ " "+this.marks;
}
@Override
public int hashCode() {
	System.out.println("calling hashcode");
	return this.id;
}
@Override
public boolean equals(Object obj) {
	System.out.println("calling equals method");
	Student st=(Student)obj;
	return this.id==st.id ;
}
@Override//sort based on id
/*public int compareTo(Object ob) {
	Student st=(Student)ob;
	return this.id-st.id;
}*/
//sort based on name
public int compareTo(Object ob) {
	Student st=(Student)ob;
	String s1=this.name;
	String s2=st.name;
	int value=s1.compareTo(s2);
	return value;
}
//sort based on marks
/*public int compareTo(Object ob) {
	Student st=(Student)ob;
	return (int)((this.marks-st.marks)*1000);
}*/
}
