package edu.femxa.val;

import java.util.Scanner;

public class ClaseRodrigo {
	public static String pedirPalabra () {
		
		String palabra = null;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			palabra = scanner.nextLine();
		
		
		return palabra;

		}
		
		public static void main(String[] args) {
			
			String palabrita = null;
			int longi = 0;
			int index = 0;
			char letra = 0;
				palabrita = new String();
				
				System.out.println("escribe ");
				palabrita = pedirPalabra();
				
				System.out.println(palabrita.length());
				longi = palabrita.length();
			
				int j = 0;
				while (index < longi)
				{
					letra= palabrita.charAt(index);
					System.out.println("La letra " + index + " es " + letra); 
					index ++;
				}
					
				/*for (int i = 0 ; i < longi ;i = i + 1 )
				{	
					j = i+1;
					System.out.println("La letra " + j + " es " + palabrita.charAt(i));	
					//System.out.println(palabrita.length());
				}
				*/
			}

}
