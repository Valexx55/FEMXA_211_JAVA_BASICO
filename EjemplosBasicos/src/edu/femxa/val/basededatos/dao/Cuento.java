package edu.femxa.val.basededatos.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Cuento {
	
	private static final String PREFIJO ="story_";
	private static final String SUFIJO =".properties";
	private static final String CLAVE_F_SALIDA = "outfile";
	private static final String CLAVE_F_INICIO = "start";
	private static final String CLAVE_F_CUERPO = "body";
	private static final String CLAVE_F_FINAL = "end";
	
	
	public static void main(String[] args) {
		try{
			
			Properties propiedades = null;
			String idioma = args[0];
			String nombre_fich = PREFIJO+idioma+SUFIJO;
			FileReader fr = new FileReader(nombre_fich);
			String nfs = null;
			String parte_principio = null;
			String parte_cuerpo = null;
			String parte_final = null;
					
				propiedades = new Properties();
				propiedades.load(fr);
				
				nfs = propiedades.getProperty(CLAVE_F_SALIDA);
				File f = new File (nfs);
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				
				parte_principio = propiedades.getProperty(CLAVE_F_INICIO);
				parte_cuerpo = propiedades.getProperty(CLAVE_F_CUERPO);
				parte_final	= propiedades.getProperty(CLAVE_F_FINAL);
				
				bw.write(parte_principio+"\n");
				bw.write(parte_cuerpo+"\n");
				bw.write(parte_final);
				
				bw.close();
				fw.close();
				
			
		}catch (Throwable t)
		{
			t.printStackTrace();
		}
	}

}
