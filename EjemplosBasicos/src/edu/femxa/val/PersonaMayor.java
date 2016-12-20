package edu.femxa.val;

import java.util.Scanner;


/**
 * Haced un programa que pida los datos de 3 
 * persona y me diga el nombre la de persona 
 * mayor
 * 
 * @author Administrador
 *
 */
public class PersonaMayor {

	
	 public static final int NUMERO_PERSONAS = 3;
	
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
		
		String nombre = null;
		int edad = 0;
		int edadMayor = 0;
		
		Persona personaMayor = new Persona();
		//Persona p = new Persona();

		for(int i=0; i < NUMERO_PERSONAS; i++ ){
			System.out.print("Introduzca su nombre: ");
			nombre = pedirNombre();
			System.out.print("Introduzca su edad: ");
			edad = pedirEdad();			
			
			if (edad > edadMayor){
				edadMayor = edad;
				personaMayor.setNombre(nombre);
				personaMayor.setEdad(edad);
			}
		}	
		System.out.println("El alumno de mayor edad es: " +personaMayor.getNombre());
}
}

