package edu.femxa.val.equals;

public class MainEquals {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("VAL", 33);
		Persona p2 = new Persona("VAL", 34);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.equals(p2))
		{
			System.out.println("Peronas SON IGUALES");
		}
		else
		{
			System.out.println("Personas Distintas");
		}
		
		String palabra1 = "ADIOS";
		String palabra2 = "ADIOS";
		
		System.out.println(palabra1);
		System.out.println(palabra2);
		
		/*if (palabra1 == palabra2)
		{
			System.out.println("PALABRAS IGUALES");
		}
		else
		{
			System.out.println("DISTINTAS");
		}
		
		if (palabra1.equals(palabra2))
		{
			System.out.println(" EQ PALABRAS IGUALES");
		}
		else
		{
			System.out.println("DISTINTAS");
		}

		*/
		
	}

}
