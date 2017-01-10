package edu.femxa.val.ejernavi;

import java.util.Scanner;


public class Main {
	
public static void main(String[] args) {
		
		ListaPersonas listaP = new ListaPersonas();
		String nombre = null;
		int edad = 0;
			Scanner scan = null;
			scan = new Scanner(System.in);
		
		int persona_buscar = listaP.buscarPersonaPos("pepa");
		System.out.println("Inserten dos personas: ");
		
		for (int i = 0; i < ListaPersonas.TAMANIO_LISTA; i++) 
		{
			nombre = scan.next();
			edad = scan.nextInt();
			Persona persona = new Persona(nombre,edad);
			listaP.insertarPersona(persona);
		}
		
	}
	
	/*public static void main(String[] args) {
		System.out.println("Empieza el pgm");
		
		ListaPersonas lp = new ListaPersonas();
		
		Persona persona1 = new Persona("pp", 55);
		Persona persona2 = new Persona("ana",65);
		
		lp.insertarPersona(persona1);
		lp.insertarPersona(persona2);
		//lp.listarPersonas();
		int res =lp.buscarPersonaPos("ana");
		if (res == -5)
		{
			System.out.println("NO EXISTE");
		}
		else {
			System.out.println("EXISTE EN LA POS " + res);
			Persona p = lp.obtenerPersona(res);
			p.mostrarPersona();
		}
		
		
		
	
	}*/

}
