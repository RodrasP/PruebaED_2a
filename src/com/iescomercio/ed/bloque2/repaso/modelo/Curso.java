package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Metodo para eliminar a los alumnos de la lista de alumnos
	 * 
	 * @param dni Dni de la persona la cual queremos eliminar
	 * @throws Exception Si el DNI no tiene la longuitud edecuada
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Metodo para aniadir alumnos a la lista
	 * 
	 * @param p Se debe introducir una Persona.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Metodo para comprobar si una persona esta ya registrada o no
	 * 
	 * @param dni Dni de la persona la cual queremos buscar
	 * @return Devuelve verdadero o falso en caso de encontarar a la persona o no
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Constructo de la clase Curso
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Metodo para saber el nunero de alumnos que hay
	 * 
	 * @return Devuelve el numero de aumnos
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
