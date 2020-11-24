package com.prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            ", mobileNumbers=" + mobileNumbers +
            '}';
    }
}

class Address{
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

class MobileNumber{
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

public class StreamExam {
	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"), Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

	    Student student2 = new Student("Khyati", 20, new Address("1235"), Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

	    Student student3 = new Student("Jason", 20, new Address("1236"), Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	    
	    Stream<Student> stream = Stream.of(student1, student2, student3);
	    /*****************************************************
        Get student with exact match name "jayesh"
       *****************************************************/
	    //stream.filter(stud -> stud.getName().equals("Jayesh")).findFirst().ifPresent(stud -> System.out.println(stud));
	    
	    /*****************************************************
        Get student with matching address "1235"
       *****************************************************/
	    
	    /*Student st = stream.filter(stud -> stud.getAddress().getZipcode().equals("1235")).findFirst().get();
	    System.out.println(st);*/
	   
	    /*****************************************************
        Get all student having mobile numbers 3333.
       *****************************************************/
	    /*List<Student> list = stream.filter(student -> student.getMobileNumbers().stream().anyMatch(mob -> mob.getNumber().equals("3333"))).collect(Collectors.toList());
	    System.out.println(list);
	    list.stream().map(stud -> stud.getName()).forEach(name -> System.out.println(name));*/
	    
	    /*****************************************************
        Get all students having mobile number 1233 and 1234
        *****************************************************/
	    /*stream.filter(student -> student.getMobileNumbers().stream().anyMatch(mob -> mob.getNumber().equals("1233") || mob.getNumber().equals("1234"))).map(stud -> stud.getName()).forEach(name -> System.out.println(name));*/
	    
	    /*****************************************************
        Convert List<Student> to List<String> of student name
       *****************************************************/
	    
	    /*stream.map(student -> student.getName()).collect(Collectors.toList());*/
	    
	    /*****************************************************
        Convert List<students> to String
       *****************************************************/
	    
	    /*String name = stream.map(Student::getName).collect(Collectors.joining(","));
	    System.out.println(name);*/
	    
	    /*****************************************************
        Change the case of List<String>
       *****************************************************/
       /*List<String> nameList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
       String names = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(","));
       System.out.println(names);*/
	   
	    /*****************************************************
        Sort List<String>
        *****************************************************/
       /*List<String> namesList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
       String names = namesList.stream().sorted().collect(Collectors.joining(","));
       System.out.println(names);*/
	    
	    
	}
}
