package edu.femxa.val.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDatos {
	
	
	public static void mostrarLista 
	(ArrayList<Empleado> lemp)
	{
		for (Empleado emp : lemp)
		{
			System.out.println(emp.getNombre());
		}
	}
	
	
	public static void main(String[] args){
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		ArrayList<Empleado> lista_empleados = null;
		
		lista_empleados = new ArrayList<Empleado>();
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
  	        stmt = conn.createStatement();
			rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADOS_SALARIO_ASC);
			String nombre = null;
			Integer id = null;
			while (rset.next())
				
			    {
					  
					nombre = rset.getString("FIRST_NAME");
					id = rset.getInt(1);
					System.out.println("Nombre = "+nombre + " ID = " +id);
				 }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   

	}

}