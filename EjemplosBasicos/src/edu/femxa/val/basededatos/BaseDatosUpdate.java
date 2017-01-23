package edu.femxa.val.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosUpdate {
	
	
	private static void liberarRecursos (Statement st, ResultSet rs)
	{
		
		if (rs != null) 	{ try { rs.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		
	}
	
	
	private static void liberarRecursos (Statement st)
	{
		
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	  	
		
	}
	
	private static void liberarRecursos (Connection conn)
	{
		
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	  	
		
	}
	
	private static void subeSueldo (Connection conn)
	{
		Statement st = null;
		
		try
		{
			st = conn.createStatement();
			st.execute(Consultas.ACTUALIZAR_EMPLEADOS_SALARIO_ADMON_E_IT);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			liberarRecursos(st);
			
		}
	}
	
	private static void consultaEmpleados (Connection conn)
	{
		Statement st = null;
		ResultSet rs = null;
		
		try{
			
			st = conn.createStatement();
			rs = st.executeQuery(Consultas.CONSULTA_EMPLEADOS_SALARIO_ADMON_E_IT);
			String nombre = null;
			Integer salario = 0;
			System.out.println("----------------------");
			System.out.println("INICIO DE MOSTRAR");
			System.out.println("----------------------");
			
			
			while (rs.next())
			    {
					nombre = rs.getString(1);
					salario = rs.getInt(2);
					System.out.println("Nombre = "+nombre + " || Salario = " +salario);
				 }
			System.out.println("----------------------");
			System.out.println("FIN DE MOSTRAR");
			System.out.println("----------------------");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			liberarRecursos(st, rs);
			
		}
			
	}
	
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
		    conn.setAutoCommit(false);
			consultaEmpleados(conn);
		    subeSueldo(conn);
		    consultaEmpleados(conn);
		    conn.commit();
		    
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error ejecutando bd");
			conn.rollback();
			
		} finally {
			liberarRecursos(conn);
		}
	}

}
