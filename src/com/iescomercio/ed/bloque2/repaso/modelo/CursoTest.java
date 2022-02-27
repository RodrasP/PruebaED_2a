package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void testEliminarAlumno() {
		Curso c = new Curso();
		c.aniadirAlumno(new Persona("123456789", "pedro", "sanz"));
		c.aniadirAlumno(new Persona("123456788", "juan", "sanz"));
		int numeroAlumAntes = c.numeroAlumnos();
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e1) {
		}
		int numeroAlumDes = c.numeroAlumnos();
		assertEquals(numeroAlumAntes - 1, numeroAlumDes);
		assertThrows(Exception.class, () -> c.eliminarAlumno("12"));
	}

			
	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

		
	
	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
		
		
	}

	
	
	@Test
	void testCurso() {
		fail("Not yet implemented");


	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
