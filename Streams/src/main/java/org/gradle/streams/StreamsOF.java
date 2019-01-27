package org.gradle.streams;

import java.util.stream.Stream;

public class StreamsOF {

	public static void main(String... args) {
		
		Stream<String> streamof = Stream.of("Edwin", "Didier", "Mendez", "Rojas");
		streamof.forEach(System.out::println);
		
	}
	
}
