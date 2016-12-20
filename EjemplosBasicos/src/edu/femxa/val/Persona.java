package edu.femxa.val;

public class Persona {
	
	private int edad;
	private String nombre;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		String nombre = null;
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre + this.edad;
		}
	
	
		public Persona ()
	{
			nombre = "Alberto";
			edad = 23;			
			System.out.println(this.toString());
		//me crea una persona vacía
	}
	
	public void mostarPersona ()
	{
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
	}
	
	

}
