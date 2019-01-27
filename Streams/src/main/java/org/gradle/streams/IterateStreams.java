package org.gradle.streams;

import java.util.stream.Stream;

public class IterateStreams {

	public static void main(String... args) {
		
		Stream<Integer> streamIterate = Stream.iterate(0, numero -> numero + 2).limit(10);
		streamIterate.forEach(numero -> System.out.println(numero.toString() + ""));
		
	}
	
}
