package org.gradle.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctStreams {

	public static void main(String... args) {
		
		List<Integer> distinct = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Stream<Integer> distinctStreams = distinct.stream().distinct();
		distinctStreams.forEach(System.out::println);
		
	}
	
}
