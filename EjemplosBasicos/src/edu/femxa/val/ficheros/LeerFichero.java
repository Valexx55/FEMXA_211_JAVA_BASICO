package edu.femxa.val.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	public static void main(String[] args) throws IOException {
		File archivo = new File ("pepe");
		FileReader filereader = new FileReader(archivo);
		int a = filereader.read();
		int b = filereader.read();
		
		char c = (char)a;//CASTING!: Conversión de tipos equivalentes
		
		//char d = (char)b;//CASTING!: Conversión de tipos equivalentes
		
		System.out.println(a);
		System.out.println(c);
		/*System.out.println(b);
		System.out.println(d);*/
		filereader.close();
		
	}

}
