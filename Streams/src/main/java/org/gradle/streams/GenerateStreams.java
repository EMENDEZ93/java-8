package org.gradle.streams;

import java.util.stream.Stream;

public class GenerateStreams {

	public static void main(String... args) {
		
		Stream<Double> generateStreams = Stream.generate(Math::random).limit(10);
		generateStreams.forEach(numero -> System.out.println(numero.toString()));
		
	}
	
}
