package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {
	public Curso c;


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
	
	 @BeforeEach
	    void beforeEach() {
	        c = new Curso();
	        c.aniadirAlumno(new Persona("123456789", "juan", "gomez"));
	        c.aniadirAlumno(new Persona("25", "pepe", "sanchez"));
	        c.aniadirAlumno(new Persona("123477789", "adrian", "ocaña"));
	    }

	
	@Test
    void testEliminarAlumno() {
        try {
            int numBefore = c.numeroAlumnos();
            c.eliminarAlumno("123456789");
            int numAfter = c.numeroAlumnos();
            assertEquals(numBefore - 1, numAfter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void testEliminarAlumnoError() {
        assertThrows(Exception.class, () -> c.eliminarAlumno("1"));
    }
			
	@Test
	void testAniadirAlumno() {
		Curso c = new Curso();
		int numeroAlumAntes = c.numeroAlumnos();
		c.aniadirAlumno(new Persona("1234", "pedro", "sanz"));
		c.aniadirAlumno(new Persona("12345", "juan", "sanz"));
		int numeroAlumDes = c.numeroAlumnos();
		assertEquals(numeroAlumAntes + 2, numeroAlumDes);

	}

		
	
	@Test
	void testEstaRegistrado() {

		Curso c = new Curso();
		
		c.aniadirAlumno(new Persona("123456789", "pedro", "sanz"));
		c.aniadirAlumno(new Persona("123456788", "juan", "sanz"));
		
		
		assertTrue(c.estaRegistrado("123456789"));
		assertFalse(c.estaRegistrado("123456777"));

		
		
	}

	
	
	@Test
	void testCurso() {
		ArrayList<Persona> listaAlumnos=new ArrayList<Persona>();
		Curso c=new Curso();
		Persona p = new Persona("123456789","juan","gomez");
		c.aniadirAlumno(p);
		listaAlumnos.add(p);
		
		assertEquals(listaAlumnos.size(), c.numeroAlumnos());

	}

	@Test
	void testNumeroAlumnos() {
		
		Curso c = new Curso();
		c.aniadirAlumno(new Persona("123456789", "pedro", "sanz"));
		c.aniadirAlumno(new Persona("123456788", "juan", "sanz"));
		assertEquals(2, c.numeroAlumnos());
		
		
	}

	

}
