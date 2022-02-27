package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	
	@Test
	void testPersonaStringStringString() {
		Persona p = new Persona("123456789","juan","gomez");
		Persona p2 = new Persona("123456789","juan","gomez");
	}

	@Test
	void testGetDni() {
		Persona p1 = new Persona ("123456789", "pedro", "marquez");
		
		
		assertEquals("123456789", p1.getDni());
		
	}

	
	
	
	
	
	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		Persona p = new Persona ("12345678A", "Pedro", "Gonzalez");
		
		assertEquals("Pedro", p.getNombre());
		
		
		
	}

	
	
	
	@Test
	void testSetNombre() {
		Persona p = new Persona();
		p.setNombre("Felipe");
		
		assertEquals("Felipe", p.getNombre());
		
		
	}

	@Test
	void testGetApellido1() {
		Persona p = new Persona ("12345678A", "Pedro", "Gonzalez");
		
		assertEquals("Gonzalez", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

	

}
