package edu.femxa.val.basededatos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.control.skin.TreeTableRowSkin;

public class EmployeseDAO {
	
	/**
	 * Conectarme a la base de datos
	 * ejecutar la consulta
	 * para cada registro, 
	 * 	crear un objeto empleadosDTO
	 * 	add ese DTO a la lista
	 * librerar Recursos
	 * @throws Exception 
	 */
	
	public List<EmployeesDTO> consultaAllEmpleados () throws Exception
	
	{
		List<EmployeesDTO> lista_e = null;
		
			lista_e = new ArrayList<EmployeesDTO>();
		
			
			Connection conn =null;
			ResultSet rset =null;
			Statement stmt=null;
			
			
			int idEmpleado=0;
			String firstName=null;
			int salary=0;
			
			try 
			{
				DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
				
				conn= DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
				stmt=conn.createStatement();
				conn.setAutoCommit(false);
				
				rset = stmt.executeQuery(Consultas.SELECT_EMPLEADOS);
				
				while (rset.next())
				{
					
					idEmpleado=rset.getInt("EMPLOYEE_ID");
					firstName=rset.getString("FIRST_NAME");
					salary=rset.getInt("SALARY");
					EmployeesDTO emp =new EmployeesDTO(idEmpleado, firstName, salary);
					
					lista_e.add(emp);
					
					
				}
				
				
			} 
			
			catch (Exception e)
			{
				
				e.printStackTrace();
				throw e;
				
				
			}
			
			finally 
			{
				if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
			  	   
			}   
			
			
			
		return lista_e;
	}

}
