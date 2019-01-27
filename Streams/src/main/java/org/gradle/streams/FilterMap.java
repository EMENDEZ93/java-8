package org.gradle.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap {

	public static void main(String... args) {
	
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	List<String> resultado = numeros.stream().filter(numero -> (numero % 2) == 0).map(numero -> "{" + numero + "}")
			.collect(Collectors.toList());
	
	System.out.println("******************************");
	System.out.println(resultado.get(0));
	
	
	System.out.println("******************************");
	
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
	Stream<Integer> result = numbers.stream().filter(number -> {
		//System.out.println("filter : { " + number + " } ");
		return (number % 2) == 0;
	}).map(number -> {
		//System.out.println("map : { " + number + " }");
		return number;
	}); 
	
	result.forEach(System.out::println);
	
	}
}
