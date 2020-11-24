package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortBasedOnTwoFields {
	public static void main(String[] args) {
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(new Employee1(111, "sandeep", 35000));
		list.add(new Employee1(222, "rupesh", 40000));
		list.add(new Employee1(333, "sasi", 29000));
		list.add(new Employee1(444, "shanmukh", 42000));
		list.add(new Employee1(555, "shabaz", 40000));
		list.add(new Employee1(666, "seenu", 35000));
		System.out.println(list);
		//(emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary());
		/*List<Employee1> list1 = list.stream().sorted(Comparator.comparing(Employee1::getSalary).thenComparing(Employee1::getName)).collect(Collectors.toList());
		System.out.println(list1);*/
		
		/*List<Employee1> list1 = list.stream().sorted((emp1, emp2) -> {
			int i = emp1.getSalary().compareTo(emp2.getSalary());
			if(i == 0) {
				i = emp1.getName().compareTo(emp2.getName());
			} 
			return i;
			
		}).collect(Collectors.toList());
		System.out.println(list1);*/
		ArrayList<String> l = new ArrayList<>();
		l.add("sandeep");
		l.add("sandeep");
		l.add("rupesh");
		l.add("shannu");
		l.add("shannu");
		
		
		Long map = l.stream().collect(Collectors.counting());
		System.out.println(map);
		
		Collections.sort(list, new Comparator<Employee1>() {

			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
}

class Employee1 {
	private Integer id;
	private String name;
	private Integer salary;
	
	public Employee1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}