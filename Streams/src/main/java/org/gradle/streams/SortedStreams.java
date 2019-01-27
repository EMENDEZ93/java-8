package org.gradle.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedStreams {

	public static void main(String... args) {
		
		List<Integer> sortNumer = Arrays.asList(9,5,6,2,1,3,4,7,8);
		Stream<Integer> sorts = sortNumer.stream().sorted();
		sorts.forEach(System.out::println);
	}
	
}
