
public class Student {
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

}
