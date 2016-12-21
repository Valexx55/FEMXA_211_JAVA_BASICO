package edu.femxa.val.cadenas;

public class Cesar {
	
	public static void main(String[] args) {
		Cesar cesar = null;
			cesar = new Cesar();
			String resultado = cesar.cifradoCesar("PAPI CHULO", 1);
			System.out.println(resultado);
	}
	
	public String cifradoCesar (String palabra, int clave)
	{
		String palabra_cifrada = null;
		int longi = palabra.length();
		char caracter_actual = 0;
		int numero_caracter = 0;
		char caracter_cifrado = 0;
		
			palabra_cifrada = new String();
			
			for (int pos = 0; pos < longi; pos++)
			{
				caracter_actual = palabra.charAt(pos);
				if (caracter_actual != ' ')
				{
					numero_caracter = (int)caracter_actual;
					numero_caracter = numero_caracter + clave;
					caracter_cifrado = (char)numero_caracter;
					palabra_cifrada = palabra_cifrada + caracter_cifrado;
				} else { palabra_cifrada = palabra_cifrada + caracter_actual;}
				
			}
		
		return palabra_cifrada;
	}

}
