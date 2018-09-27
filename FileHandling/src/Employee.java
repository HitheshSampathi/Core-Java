import java.io.Serializable;

public class Employee implements Serializable {
	String name;
	transient int id;
	double salary;
	public Employee(String name, int id, double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return "Employee [name="+name+" ,id="+id+" ,salary="+salary+ "]";
		
	}
	
}
