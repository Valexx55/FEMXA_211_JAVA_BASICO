package edu.femxa.val.basededatos.dao;

public class EmployeesDTO {
	
	private int idEmpleado;
	private String firstName;
	private int salary;
	private int dpto;
	
	
	
	public EmployeesDTO(int idEmpleado, String firstName, int salary, int dpto) {
		
		this.idEmpleado = idEmpleado;
		this.firstName = firstName;
		this.salary = salary;
		this.dpto = dpto;
	}
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDpto() {
		return dpto;
	}
	public void setDpto(int dpto) {
		this.dpto = dpto;
	}
	
	
	
	

}
