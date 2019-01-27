package org.gradle.methodreference;

import java.util.function.Consumer;

public class Main {
	
	private static void print(String s, Consumer<String> c) {
		c.accept(s);
	}

	public static void main(String... args) {
	
		int a = 1, b = 2;
		print(a + " + " + b + " = ", s -> System.out.println(s) );
		
	}
	
	
}
