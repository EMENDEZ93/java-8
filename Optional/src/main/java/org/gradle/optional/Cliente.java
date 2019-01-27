package org.gradle.optional;

import java.util.Optional;

public class Cliente {

	private String nombre;
	private Optional<Address> address = Optional.empty();

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

}
