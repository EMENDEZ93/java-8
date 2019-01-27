package org.gradle.optional;

import java.util.Optional;

public class Main {

	public static void main(String... args) {

		String text = null;

		Optional<String> optionalText = Optional.ofNullable(text);
		System.out.println(optionalText.orElse("nullo"));

		String text2 = "Edwin Didier Mendez Rojas";
		Optional<String> optionalTexto = Optional.ofNullable(text2);
		optionalTexto.ifPresent(word -> System.out.println("Value -> " + word));

		System.out.println("*******************************");

		Address address = new Address("USA");
		Optional<Address> optionalAddress = Optional.ofNullable(address);

		optionalAddress.map(Address::getLocation).filter(location -> location.contains("US"))
				.ifPresent(location -> System.out.println("Address contains \"US\" -> " + location));

		System.out.println("*******************************");

		Address address_ = null;
		Optional<Address> optionaLAddress = Optional.ofNullable(address_);

		Address address1 = optionaLAddress.orElseGet(() -> {
			System.out.println("System: addres with null location will be replace with default value");
			return new Address("default location for null address");
		});

		System.out.println("Location -> " + address1.getLocation());

		System.out.println("*******************************");

		Cliente cliente = new Cliente("Edwin");

		Optional<Cliente> client = Optional.ofNullable(cliente);

		String location = client.flatMap(Cliente::getAddress).map(Address::getLocation).orElse("Location not detected");

		System.out.println(location);

	}

}
