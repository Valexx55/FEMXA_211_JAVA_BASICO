package edu.femxa.val;

import java.util.Scanner;

public class MainPersona {
	
	public static int N_PERSONAS = 5;
	
	public static int pedirEdad ()
	{
		int num_leido = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in); //preparo para leer de la entrada estándar (teclado)
			num_leido = scanner.nextInt(); //leo y asigno
			
		
		return num_leido;
	}
	
	public static String pedirNombre ()
	{
		String nombre = null;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in); //preparo para leer de la entrada estándar (teclado)
			nombre = scanner.nextLine(); //leo y asigno
			
		
		return nombre;
	}
	
	public static void main(String[] args) {
		
		Persona persona = null;
		String nombre_aux = null;
		int edad_aux = 0; //aux, de variable AUXILIAR - sólo sirve para guardar un dato temporalmente
		
		persona = new Persona();
		for (int i = 0; i < N_PERSONAS; i++) {
			
			System.out.println("Introduzca el nombre de la persona " + i);
			nombre_aux = pedirNombre();
	
			System.out.println("Introduzca el nombre de la persona " + i);
			edad_aux = pedirEdad();
			
			persona.setEdad(edad_aux);
			persona.setNombre(nombre_aux);
			
			persona.mostarPersona();
		}
	}

}
