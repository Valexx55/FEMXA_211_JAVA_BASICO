package edu.femxa.val.aleatorio;

import java.util.Scanner;

public class AdivinanzaNumAleatorio
{
	public static final int MAX_INTENTOS = 5;
	
	public enum TipoResultado {MAYOR, MENOR, IGUAL};
	
	
	public static TipoResultado comparar (int numero_usuario, int num_aleatorio)
	{
		TipoResultado resultado = TipoResultado.MAYOR;
		
			if (num_aleatorio<numero_usuario)
				{resultado = TipoResultado.MAYOR;}
			else if (num_aleatorio>numero_usuario)
					{resultado = TipoResultado.MENOR;}
			else {resultado = TipoResultado.IGUAL;}
				
		
		return resultado;
	}
	
	public static int generarAleatorio ()
	{
		int num_aleatorio = 0;
		
			num_aleatorio = (int)(Math.random()*100)+1;
			
		return num_aleatorio;
	}
	
	public static int pedirNumeroUsuario ()
	{
		int numero_usuario = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in);
			numero_usuario = scanner.nextInt();
		
		return numero_usuario;
	}
	
	public static void main(String[] args) {
		
		/**
		 * 1 generarAleatorio
		 *  2 pedir num al usuario
		 *  3 comparar
		 * 4 mientras no acierto
		 */
		boolean adivinado = false;
		int num_aleatorio = generarAleatorio();
		int numero_usuario = 0;
		int num_intentos = 0;
		TipoResultado res = null;
		
		
			do
			{
				System.out.println("Adivina número :");
				numero_usuario = pedirNumeroUsuario();
				num_intentos = num_intentos + 1;
				res = comparar (numero_usuario, num_aleatorio);
				
				switch (res) {
				case MAYOR:
						System.out.println("El número introducido es mayor que el buscado");
					break;

				case MENOR:
					System.out.println("El número introducido es menor que el buscado");
				break;
				
				case IGUAL:
					System.out.println("Acertaste! ");
					adivinado = true;
				break;
				
				}
				
			} while ((num_intentos<MAX_INTENTOS) && (!adivinado));
			
			if (!adivinado)
			 {
				System.out.println("Ha terminado sus intentos");
			 }
		
	}
	
}