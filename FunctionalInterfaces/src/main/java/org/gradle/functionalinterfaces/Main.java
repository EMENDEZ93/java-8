package org.gradle.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void ejecutarMetodo(InterfaceFuncional interfaceFuncional) {
		interfaceFuncional.doFuncion();
	}
	
	public static void checklist(List<Integer> list, Predicate<Integer> predicate) {
		
		System.out.println("<------------------------------->");
		
		for(Integer i : list) {
			if(predicate.test(i)) {
				System.out.println(i + " ");
			}
		}
		
	}
	
	
	public static void main(String... args) {
		
		ejecutarMetodo(new InterfaceFuncional() {
			public void doFuncion() {
				System.out.println("invocación usando Anonymous Inner Class");
			}
		});
		
		ejecutarMetodo(() -> System.out.println("invocación usando Lambda Expressions") );
		
		// test predict<T>
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate<Integer> predicate = i -> i > 5;
		checklist(list, predicate);
		checklist(list, i -> i < 5);
		
		List<Cliente> cliente = new ArrayList<>();
		cliente.add( new Cliente("Edwin", "Mendez") );
		cliente.add( new Cliente("Didier", "Rojas") );
		
		Function<Cliente, String> nombreCompleto = client -> { 
			return client.getNombre() + " " + client.getApellido();
		};
		
		for(Cliente client: cliente) {
			System.out.println(client.printNombreCompleto(nombreCompleto));
		}
		
	}
	
}
