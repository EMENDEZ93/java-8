package org.gradle.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String... args) {
		
		class Cliente {
			public String nombre;
			public List<String> programing = new ArrayList<>();
			
			public Cliente(String nombre, List<String> programing) {
				super();
				this.nombre = nombre;
				this.programing = programing;
			}
			
		}
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<String> lista1 = Arrays.asList("Java", "Python", "JavaScritp");
		List<String> lista2 = Arrays.asList("Spring Framewok", "Java Tecnology", "Sample Code");
		clientes.add(new Cliente("Cliente 1", lista1));
		clientes.add(new Cliente("Cliente 2", lista2));
		
		Stream<String> clientesStreams = clientes.stream().flatMap(cliente -> {
			//System.out.println("-- cliente: " + cliente.nombre );
			return cliente.programing.stream();
		});
		
		System.out.println("******************************");
		clientesStreams.forEach(System.out::println);
		
	}
	
}
