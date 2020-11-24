package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayStream {
	public static void main(String[] args) {
		String[] array = {"sachin", "yuvraj", "dhoni", "jadeja"};
		
		/*different ways of converting array to list*/
		/*1. By using Arrays utility class asList method. If we use this method, then we cannot modify the structure. 
		  If we try to add new object, then UnsupportedOperationException raises. It gives List representation of an Array*/
		
		/*2. If we want to convert array to list and then add some data to that, then we have to use parameterised constructor
		  with parameter Arrays.asList(array)*/
		
		/*List<String> list = Arrays.asList(array);
		list.add("another");*/		
		
		List<String> l = new ArrayList<>(Arrays.asList(array));
		l.add("another");
		System.out.println(l);
		
		ArrayList<String> list24 = Arrays.stream(array)
                .collect(Collectors.toCollection(() -> new ArrayList<String>()));
		System.out.println(list24);
		
	}
}
