package org.gradle.streams;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SplitAsStreams {

	public static void main(String... args) {
		String texto = "Edwin Didier Mendez Rojas";
		Stream<String> streamWords = Pattern.compile("\\W").splitAsStream(texto);
		streamWords.forEach(System.out::println);
	}
}
