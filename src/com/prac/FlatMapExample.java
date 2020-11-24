package com.prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		String[] array1 =  {"sachin", "yuvraj", "dhoni", "jadeja"};
		String[] array2 =  {"sandeep", "rupesh", "shabaz"};
		
		List<String> list = Arrays.asList(array1).stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		System.out.println(list);
		
		List<String> l = Stream.of(array1, array2).flatMap(Arrays::stream).collect(Collectors.toList());
		System.out.println(l);
		
	}
}
