package edu.femxa.val.ficheros;

import java.io.File;
import java.io.IOException;

public class MainCrearFichero {
	
	public static void main(String[] args) throws IOException {
		File f = new File ("hola.jsp");
				
		if (f.exists())
		{
			f.delete();
		}
		
		if (f.createNewFile())
		{
			System.out.println("Archivo creado");
		}
	}

}
