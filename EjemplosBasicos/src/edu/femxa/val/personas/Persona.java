package edu.femxa.val.personas;

public class Persona {
	
	private int edad;
	private String nombre;
	
	public Persona ()
	{
		//constructor por Defecto
	}
	
	/**
	 * Constructro usando parámetros
	 * @param nombre
	 * @param edad
	 */
	public Persona (String nombre, int edad)
	{
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
