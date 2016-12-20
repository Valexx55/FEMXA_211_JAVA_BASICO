package edu.femxa.val;

public class PalabraCadena {

	public void mostrarLetrasPalabraHastaEncontrarLetra (String palabra, char letra)
	{
		
	}
	
	public void mostrarLetrasPalabra (String palabra)
	{
		int index = 0;
		int longi = palabra.length();
		char letra = 0; //la letra es un número en el fondo, recuerda
		
		while (index < longi)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
			index = index + 1;
		}
		
	}
	
	
	public static void main(String[] args) {
		PalabraCadena palabraCadena = null;
		
			palabraCadena = new PalabraCadena();
			palabraCadena.mostrarLetrasPalabra("VALENTINO");
			palabraCadena.mostrarLetrasPalabraHastaEncontrarLetra("VALENTINO", 'L');
	}
	
}
