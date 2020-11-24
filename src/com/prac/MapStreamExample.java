package com.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamExample {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(111, "sandeep"));
		list.add(new Employee(222, "rupesh"));
		list.add(new Employee(333, "rakesh"));
		System.out.println(list);
		Map<Integer, String> map = list.stream().filter(emp -> emp.getName().startsWith("r")).collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));
		System.out.println(map);
	}
}

class Employee {
	 Integer id;
	 String name;
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.id+"-"+this.name;
	}
}