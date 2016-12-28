package edu.femxa.val.personas;

public class PrincipalPersona {
	
	public static final int NUM_PERSONAS = 1;
	public static void main(String[] args) {
		Persona  array_persona[] = null;
		Persona persona_aux = null;
		String nombre_aux = null;
		int edad_aux = 0;
		
		array_persona = new Persona[NUM_PERSONAS];
	
		Persona persona1 = new Persona("ALEX", 27);
		array_persona [0] = persona1;
		
		for (int i = 0; i < NUM_PERSONAS; i++) 
		{
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();
			System.out.println("Nombre = " + nombre_aux);
			System.out.println("Edad = " + edad_aux);
		}
	}

}
