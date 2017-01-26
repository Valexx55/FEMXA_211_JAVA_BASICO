package edu.femxa.val.basededatos.dao;

import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		EmployeseDAO empDAO=null;
		
		empDAO = new EmployeseDAO();
		
		List<EmployeesDTO> le = null;
		try {
			le = empDAO.consultaAllEmpleados();
			for (EmployeesDTO empDTO : le)
			{
				System.out.println(empDTO.getIdEmpleado()+" "+empDTO.getFirstName()+" "+empDTO.getSalary()+"€");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
