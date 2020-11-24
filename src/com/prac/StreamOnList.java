package com.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOnList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("sandeep");
		list.add("gaurav");
		list.add("sachin");
		list.add("hardik");
		list.add("yuvraj");
		System.out.println(list);
		
		//I want to filter that name whose letters are 7
		
		List<String> newList = list.stream().filter(name -> name.length() == 7).collect(Collectors.toList());
		System.out.println(newList);
		
		//I want the name whose name starts with g
		
		List<String> g = list.stream().filter(name -> name.startsWith("g")).collect(Collectors.toList());
		System.out.println(g);
		
		List<String> indian = list.stream().map(name -> name.concat(" India")).collect(Collectors.toList());
		System.out.println(indian);
		
		String[] arr = (String[])list.stream().toArray();
	}
}
