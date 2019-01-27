package org.gradle.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxStreams {

	public static void main(String... args) {
		
		Optional<String> nombre = Stream.of("A", "B", "C").max(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println(nombre);
		System.out.println(nombre.get());
		
	}
	
}
