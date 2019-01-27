package org.gradle.calculadora;

import org.gradle.calculadora.operaciones.IOperaciones;
import org.gradle.calculadora.operaciones.Suma;

public class Main {

	public static void main(String... args) {
		
		System.out.println("******************************");
		
		//IOperaciones sumar = new Suma();
		//sumar.run(2, 2);
		
		IOperaciones sumar = (int a, int b) -> a + b;
		IOperaciones sumar2 = (int a, int b) -> (a + b) % a;

		
		System.out.println( ejecutarOperacion(2,3, sumar) );
		System.out.println( ejecutarOperacion(2,3, sumar2) );
		
	}
	
	static int ejecutarOperacion(int a, int b, IOperaciones iOperaciones) {
		return iOperaciones.run(a, b);
	}
	
}
