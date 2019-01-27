package org.gradle.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumStreams {

	public static void main(String... args) {
		
		System.out.println("******************************");
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		IntStream numerosStreams = Arrays.stream(numeros);
		System.out.println(numerosStreams.sum());
		
		System.out.println("******************************");
		IntStream numerosStreams2 = IntStream.range(0, 10);
		System.out.println(numerosStreams2.sum());
		numerosStreams2.forEach(System.out::println);
		
	}
	
}
