package edu.femxa.val.json;

public class Persona {
	
	private String nombre;
	private int nhijos;
	private boolean casada;
	private boolean parado;
	
	
	
	public Persona(String nombre, int nhijos, boolean casada, boolean parado) {
		super();
		this.nombre = nombre;
		this.nhijos = nhijos;
		this.casada = casada;
		this.parado = parado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNhijos() {
		return nhijos;
	}
	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}
	public boolean isParado() {
		return parado;
	}
	public void setParado(boolean parado) {
		this.parado = parado;
	}
	
	
	

}
