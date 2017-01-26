package edu.femxa.val.basededatos.dao;

import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		EmployeseDAO empDAO = new EmployeseDAO();
		List<EmployeesDTO> le = empDAO.consultaAllEmpleados();
		
		for (EmployeesDTO empDTO : le)
		{
			System.out.println(empDTO.getFirstName());
		}
	}

}
