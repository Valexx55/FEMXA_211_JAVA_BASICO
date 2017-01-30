package edu.femxa.val.basededatos.dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EjemploPropiedades 
{
	public static void main(String[] pepi) throws Throwable 
	{
		
		System.out.println(pepi[0]);
		System.out.println(pepi[1]);
		
		
		Properties fichero_propiedaes = null;
		
		fichero_propiedaes = new Properties();
		
		FileReader fr = new FileReader("db.properties");
				
		fichero_propiedaes.load(fr);
		
		String vd = fichero_propiedaes.getProperty("driver");
		
		System.out.println(vd);
		
		fr.close();
		
		
		
		
		
	}

}
