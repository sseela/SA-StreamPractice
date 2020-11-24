package com.prac;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamWorking {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		list.stream().forEach(System.out::println);
		System.out.println("*******************");
		list.parallelStream().forEach(System.out::println);
	}
}
