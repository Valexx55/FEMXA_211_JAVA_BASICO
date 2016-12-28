package edu.femxa.val.orden;

import java.util.Scanner;

public class InsertarOrdenado {
	
	public static void desplazarDesdeHasta (int ae [], int desde, int hasta)
	{
		int pos_final = hasta;
		
		for (int pos = pos_final+1; pos > desde; pos--) 
		{
			if (pos < ae.length)
			{
				ae [pos] = ae [pos-1];
			}
		}
		
	}
	
	public static void mostrarArray (int ae [])
	{
		for (int i = 0; i < ae.length; i++) {
			System.out.print(ae[i] + " ");
		}
		System.out.println();
	}
	
	public static int obtenerPosicion (int [] ae, int n, int limite)
	{
		int pos = 0;
				
			while ((pos<limite)&&(ae[pos]<n))
			{
				pos++;
			}
		
		return pos;
	}
	
	public static int pedirNumero()
	{
		int n_pedido = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in);
			n_pedido = scanner.nextInt();
			
		return n_pedido;
	}
	
	public static void main(String[] args) {

		int ae[] = new int [10];
		int n_usuario = 0; 
		int pos = 0;
		
		for (int i = 0; i < ae.length; i++) 
		{
			System.out.println("Dame nº " + i);
			n_usuario = pedirNumero();
			pos = obtenerPosicion(ae, n_usuario, i);
			
			desplazarDesdeHasta(ae, pos, i);
			ae[pos] = n_usuario;
		}
		mostrarArray(ae);
	}

}
