package org.gradle.streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchStreams {

	public static void main(String... args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		boolean sonTodosLosNumeroMayoresQueCinco = numeros.stream().allMatch(numero -> numero > 5);
		System.out.println(sonTodosLosNumeroMayoresQueCinco);
	
		boolean hayUnNumeroMayorQueCinco = numeros.stream().anyMatch(numero -> numero > 5);
		System.out.println(hayUnNumeroMayorQueCinco);
	
		boolean noHayNumeroMayorQueDiez = numeros.stream().noneMatch(numero -> numero > 10);
		System.out.println(noHayNumeroMayorQueDiez);
	}
	
}
