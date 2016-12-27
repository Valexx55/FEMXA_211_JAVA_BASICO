package edu.femxa.val.cadenas;

public class ImprimoArgumentosSi {
	
	public static boolean palabraTieneI (String palabra)
	{
		boolean tieneI = false;
		int indice = 0;
		int longi = palabra.length();
		char car_aux = 0;
		
		while ((!tieneI)&&(indice<longi))
		{
			car_aux = palabra.charAt(indice);
			if ((car_aux=='i') ||(car_aux=='I'))
			{
				tieneI = true;
			}
			indice++;
		}
		//TODO mirar si el String palabra tiene una I
		
		
		return tieneI;
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			
			if (palabraTieneI (args[i]))
			{
				System.out.println(args[i]);
			}
		}
	}

}
