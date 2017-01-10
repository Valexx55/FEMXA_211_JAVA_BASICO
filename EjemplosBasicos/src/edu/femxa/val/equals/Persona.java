package edu.femxa.val.equals;

public class Persona {
	
	
	private int edad;
	private String nombre;

	
	public void mostrarPersona ()
	{
		System.out.println("Edad = " + this.edad);
		System.out.println("Nombre = " + this.nombre);
	}
	
	public Persona (){}
	
	public Persona(String nombre2, int edad2) {
		// TODO Auto-generated constructor stub
		this.edad = edad2;
		this.nombre = nombre2;
	}
	@Override
	public boolean equals(Object obj) {
		boolean soniguales = false;
		
		Persona p1 = (Persona) obj;
		
		if ((this.nombre == p1.nombre)&&(this.edad== p1.edad))
		{
			soniguales = true;
		}
		
		return soniguales;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
