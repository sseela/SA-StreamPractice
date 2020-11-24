package com.prac;

import java.util.Arrays;
import java.util.stream.Stream;

public class MinAndMax {
	public static void main(String[] args) {
		String[] array1 =  {"sachin", "yuvraj", "dhoni", "jadeja"};
		
		String min = Arrays.asList(array1).stream().min((a,b)-> a.compareTo(b)).get();
		System.out.println(min);
		
		String max = Arrays.asList(array1).stream().min((a,b)-> b.compareTo(a)).get();
		System.out.println(max);
		
		String max2 = Arrays.asList(array1).stream().max((a,b)-> a.compareTo(b)).get();
		System.out.println(max2);
		
		String min2 = Arrays.asList(array1).stream().max((a,b)-> b.compareTo(a)).get();
		System.out.println(min2);
		
		Stream.of(array1).min((a,b)-> a.compareTo(b)).ifPresent(a -> System.out.println(a));
		
		
	}
}
