package org.gradle.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitStreams {

	public static void main(String... args) {
		
		List<Integer> limitNumber = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Stream<Integer> limitStream = limitNumber.stream().limit(5);
		limitStream.forEach(System.out::println);
	}
	
	
}
