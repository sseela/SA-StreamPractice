package com.prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		String[] array1 =  {"sachin", "yuvraj", "dhoni", "jadeja"};
		
		//filter
		List<String> filter = Stream.of(array1).filter(name -> name.startsWith("y")).collect(Collectors.toList());
		System.out.println(filter);
		
		//map
		List<String> map =Arrays.stream(array1).map(name -> name.concat(" Indian")).collect(Collectors.toList());
		System.out.println(map);
		
		//forEach
		Arrays.asList(array1).stream().forEach(name -> System.out.println(name));
		
		//min, max
		String min = Stream.of(array1).min((a,b)-> a.compareTo(b)).get();
		System.out.println(min);
		
		//count
		Long count = Stream.of(array1).count();
		System.out.println(count);
		
		//distinct
		LinkedHashSet<String> distinct = Arrays.asList(array1).stream().distinct().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(distinct);
		
		//findAny, findFirst
		String first = Arrays.asList(array1).stream().findFirst().get();
		System.out.println(first);
		
		//reduce
		String str = Arrays.asList(array1).stream().reduce((a,b)-> a.concat(b)).get();
		System.out.println(str);
		
		//limit
		Set<String> limit = Arrays.asList(array1).stream().limit(3).collect(Collectors.toSet());
		System.out.println(limit);
		
		//sorted
		List<String> sorted = Arrays.asList(array1).stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		Map<String, String> m1 = Stream.of(array1).collect(Collectors.toMap(name -> name, name -> name));
		System.out.println(m1);
		
		HashSet<String> hashSet= Stream.of(array1).collect(Collectors.toCollection(HashSet::new));
		System.out.println(hashSet);
	}
}
