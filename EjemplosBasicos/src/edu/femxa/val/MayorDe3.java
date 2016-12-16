package edu.femxa.val;

import java.util.Scanner;

public class MayorDe3 {
	
	public static int pedirNumero ()
	{
		int num_leido = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in); //preparo para leer de la entrada estándar (teclado)
			num_leido = scanner.nextInt(); //leo y asigno
			
		
		return num_leido;
	}
	
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int mayor = 0;
		
			System.out.println("Introduzca numero 1");
			n1 = pedirNumero();
			
			System.out.println("Introduzca numero 2");
			n2 = pedirNumero();
			
			System.out.println("Introduzca numero 3");
			n3 = pedirNumero();
			
			if (n1>=n2) 
			{
				mayor = n1;
			} else
			{
				mayor = n2;
			}
			//hasta aquí, ya sé quién es mayor, N1 o n2. Ahora queda comparar con n3
			if (n3>n2)
			{
				mayor = n3;
			}
			
			System.out.println("El numero mayor es " + mayor);
	}

}
