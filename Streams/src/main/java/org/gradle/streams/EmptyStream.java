package org.gradle.streams;

import java.util.stream.Stream;

public class EmptyStream {

	public static void main(String... args) {
		
		Stream<String> emptyStream = Stream.empty();
		System.out.println("\n" + emptyStream.toArray().length);
		
	}
	
}
