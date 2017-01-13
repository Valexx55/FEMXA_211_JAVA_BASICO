package edu.femxa.val.ficheros;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
public class Lectura {
	

	
		public static void main(String[] args) throws IOException {
			String direccion = "pepe";
			leer_fichero(direccion);
			
			
		}

		public static void leer_fichero(String fichero) throws IOException{
			
			FileReader fichero1 = new FileReader(new File(fichero));
			int i=0;
			int suma=0;
			
			i = fichero1.read();
			while(i!=-1){
			//while((i = fichero1.read())!=-1){
							
					suma = suma + i;
					System.out.println(i);
					i = fichero1.read();
				}
				
			
		
			System.out.println("La suma es "+suma);
			fichero1.close();
		}

		
	
}
