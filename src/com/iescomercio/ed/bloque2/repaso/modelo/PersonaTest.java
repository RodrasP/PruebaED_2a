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
		
		try {
			
			String dni = p1.getDni();
			
		} catch (Exception e1){
			assertThrows(Exception.class, ()->p1.getDni());
		}
		
		assertEquals("123456789", p1.getDni());
		
	}

	
	
	
	
	
	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

	

}
