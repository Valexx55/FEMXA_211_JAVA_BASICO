package edu.femxa.val;

public class Cadena {
	
	public static void main(String[] argumentos) {
		
		//RECORRIENDO UN ARRAY DE PALABRAS(sTRINGS)
		int posicion_inicial = 0;
		int posicion_final = argumentos.length;
		String palabra_actual = null;
		
		for(int i=posicion_inicial;i<posicion_final;i++)
		{
			palabra_actual = argumentos[i];
			System.out.println("La palabra "+i+" es "+ palabra_actual);
		}
	}

}
