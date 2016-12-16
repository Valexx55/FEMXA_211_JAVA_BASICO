package edu.femxa.val;

import java.util.Scanner;

/**
 * Versión estructurada de un programa
 * que calcula el IMC dados el peso y
 * la altura de una persona
 * 
 * @author Administrador
 *
 */
public class IMC {
	
	public static double pedirNumero ()
	{
		double num_leido = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in); //preparo para leer de la entrada estándar (teclado)
			num_leido = scanner.nextDouble(); //leo y asigno
			
		
		return num_leido;
	}
	
	public static void informarIMC (double imc)
	{
		if (imc < 16)
		{
			System.out.println("Desnutrido");
			
		} else if ((imc >= 16) && (imc < 18))
		{
			System.out.println("Bajo peso");
		}
		else if ((imc >= 18) && (imc < 25))
		{
			System.out.println("Normal");
		}
		else if ((imc >= 25) && (imc < 31))
		{
			System.out.println("Sobrepeso");
		} else // > 31
			System.out.println("Obeso");
		
	}
	
	public static void main(String[] args) 
	{
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
			System.out.println("Introduzca peso (en KG con coma)");
			peso = pedirNumero();
			
			System.out.println("Introduzca altura (en m con coma)");
			altura = pedirNumero();
		
			imc = peso / (altura*altura);
			
			informarIMC (imc);
	}
}
