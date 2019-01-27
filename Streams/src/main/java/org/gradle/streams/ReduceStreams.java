package org.gradle.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceStreams {

	public static void main(String... args) {
		List<Integer> numeros = Arrays.asList(11,2,3,4,5,6,7,8,9);
		
		numeros.stream().reduce((a,b) -> a>b ? a : b).ifPresent( i -> System.out.println("Max: " + i ) );
		
		Integer total = numeros.stream().reduce(0, (a,b) -> a + b );
		System.out.println("Total : " + total);
		
	}
	
}
