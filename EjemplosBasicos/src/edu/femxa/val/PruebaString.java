package edu.femxa.val;

public class PruebaString {
	
	public static void main(String[] args) {
		
		String palabra = null;
		
		palabra = "HOLA";//"AITOR";
		
		System.out.println(palabra);
		
		char letrita = palabra.charAt(2);
		if (letrita=='A')
		{
			System.out.println("La letra es A");
		} else
		{
			System.out.println("La letra es NO es A");
		}
		int longitud = palabra.length();
		
		System.out.println("la letra es " + letrita);
		System.out.println("la longitud es " + longitud);
		
	}

}
