package edu.femxa.val.json;

import java.util.Date;

/*
 * Fecha, Hora, 
 * Nombre del cliente, 
 * teléfono de contacto, 
 * lugar de recogida, 
 * lugar de entrega, 
 * descripción de la tarea 
 * y hora máxima realización
 */

public class Recado implements Comparable<Recado>{
	
	private Date fecha_hora;
	private String nombre_cliente;
	private String telefono;
	private String direccion_recogida;
	private String direccion_entrega;
	private String descripcion;
	private Date fecha_hora_maxima;
	private int n_recao;
	
	
	
	public int getN_recao() {
		return n_recao;
	}


	public void setN_recao(int n_recao) {
		this.n_recao = n_recao;
	}


	public Recado ()
	{
		//TODO
	}
	
	
	public Recado(Date fecha_hora, String nombre_cliente, String telefono, String direccion_recogida,
			String direccion_entrega, String descripcion, Date fecha_hora_maxima) {
		super();
		this.fecha_hora = fecha_hora;
		this.nombre_cliente = nombre_cliente;
		this.telefono = telefono;
		this.direccion_recogida = direccion_recogida;
		this.direccion_entrega = direccion_entrega;
		this.descripcion = descripcion;
		this.fecha_hora_maxima = fecha_hora_maxima;
	}
	
	@Override
	public int compareTo(Recado r) {
		/*if (this.n_recao > r.n_recao) 
			return 1;
		else if (this.n_recao < r.n_recao)
			return -1;
		else return 0;*/
		
		int n = this.telefono.compareTo(r.telefono);
		return n;
	}
	
	
	@Override
	public String toString() 
	{
		String str_recado = null;
			
			str_recado = this.getN_recao()+ " "+this.getNombre_cliente() + " " + this.telefono + " "+ this.getDescripcion(); 
			
		return str_recado;
	}
	
	
	
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion_recogida() {
		return direccion_recogida;
	}
	public void setDireccion_recogida(String direccion_recogida) {
		this.direccion_recogida = direccion_recogida;
	}
	public String getDireccion_entrega() {
		return direccion_entrega;
	}
	public void setDireccion_entrega(String direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_hora_maxima() {
		return fecha_hora_maxima;
	}
	public void setFecha_hora_maxima(Date fecha_hora_maxima) {
		this.fecha_hora_maxima = fecha_hora_maxima;
	}


	


	
	
	

}