package org.gradle.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinIntStream {

	public static void main(String... args) {
		
		OptionalInt minimum = IntStream.of(1,2,3).min();
		System.out.println("min :" + minimum.getAsInt());
		System.out.println("min :" + minimum);
		
	}
	
}
