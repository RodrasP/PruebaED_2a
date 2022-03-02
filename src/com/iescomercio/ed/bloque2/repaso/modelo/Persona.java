package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	
	/**
	 * Constructor de la clase persona.
	 * @param dni Dni de la persona que vamos a aniadir
	 * @param nombre Nombre de la persona que vamos a  aniadir
	 * @param apellido1 Apelledido de la perosna que vamos a aniadir.
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	
	/**
	 * Metodo para obtener el dni de la persona
	 * @return Devuelve el dni de la persona 
	 */
	public String getDni() {
		return dni;
	}
	
	
	
	/**
	 * Metodo para asignar el dni de una persona, despues de haberla creado
	 * @param dni Dni el cual queremos ponerle a la persoan 
	 * @throws Exception Si el DNI contiene 9 numeros en vez de 8 numero y 8 letras
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	
	/**
	 * Metodo para saber el nombre de una persona 
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * Metodo para asignar un nombre a una persona
	 * @param nombre nombre que vamos a asignarle a la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * Metodo para aobtener el apellido de la persona
	 * @return Devuelve el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	
	/**
	 * Metodo para asignar el apellido a la una persona
	 * @param apellido1 Apellido que le vamos a asignar.
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
