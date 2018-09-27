package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 public class Program5 {
 	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1005, "Sean", 98000.00));
		empList.add(new Employee(1000, "Amy", 30000.00));
		empList.add(new Employee(1299, "Martin", 99000.00));
		empList.add(new Employee(1015, "Barry", 70000.00));
		empList.add(new Employee(1105, "Sam", 98000.00));
		empList.add(new Employee(1115, "Harry", 99000.00));
		
		System.out.println("Before Sorting empList::::");
		empList.forEach(System.out::println);
		
		System.out.println("After Sorting empList based on ID::::");
		
		Collections.sort(empList);
		empList.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1005, "Sean"));
		personList.add(new Person(1000, "Amy"));
		personList.add(new Person(1299, "Martin"));
		personList.add(new Person(1015, "Barry"));
		personList.add(new Person(1105, "Sam"));
		personList.add(new Person(1115, "Harry"));
		
		System.out.println("Before Sorting personList::::");
		personList.forEach(System.out::println);
		
		System.out.println("After Sorting personList based on ID::::");
		
		Collections.sort(personList, new SortById());
		personList.forEach(System.out::println);
		
		System.out.println("After Sorting personList based on Name::::");
		
		Collections.sort(personList, new Comparator<Person>() {
 			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		personList.forEach(System.out::println);
		
	}
}
