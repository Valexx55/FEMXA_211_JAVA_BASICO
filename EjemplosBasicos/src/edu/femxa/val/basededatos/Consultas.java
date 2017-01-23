package edu.femxa.val.basededatos;

public class Consultas {
	
	public static final String CONSULTA_EMPLEADOS_SALARIO_ASC = "SELECT * from EMPLOYEES ORDER BY SALARY DESC";
	public static final String 
	CONSULTA_EMPLEADOS_SALARIO_ADMON_E_IT 
	= "SELECT first_name, salary FROM "
			+ "EMPLOYEES where department_id IN "
			+ "(SELECT department_id FROM "
			+ "DEPARTMENTS WHERE department_name = "
			+ "'Administration' or "
			+ "department_name = 'IT')";
	
	public static final String 
	ACTUALIZAR_EMPLEADOS_SALARIO_ADMON_E_IT 
	= "UPDATE EMPLOYEES SET salary = (salary * 1.2) "
			+ "where department_id IN "
			+ "(SELECT department_id FROM "
			+ "DEPARTMENTS WHERE department_name = "
			+ "'Administration' or "
			+ "department_name = 'IT')";

}
