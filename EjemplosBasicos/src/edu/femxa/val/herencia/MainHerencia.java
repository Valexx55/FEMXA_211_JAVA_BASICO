package edu.femxa.val.herencia;

public class MainHerencia {
	
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		
		alumno.setNombre("Nira");
		alumno.setEdad(26);
		
		alumno.mostrarPersona();
		alumno.setNota(5);
		
		System.out.println("HASHCODE: " + alumno.hashCode());
		System.out.println("TOSTRING: " + alumno.toString());
		
		alumno2.setNombre("Nira");
		alumno2.setNota(6);
		alumno2.setEdad(26);
		
		//alumno2 = alumno;
		Croqueta croqueta = new Croqueta();
		
		if (alumno.equals(croqueta)) 
		{
			System.out.println("Alumno y Alumno2 son IGUALES");
		} else 
		{
			System.out.println("Alumno y Alumno2 NO son IGUALES");
		}
		
		if (alumno instanceof Persona)
		{
			System.out.println("El alumno es instancia de la clase PERSONA");
		}
		
		if (alumno instanceof Alumno)
		{
			System.out.println("El alumno es instancia de la clase ALUMNO");
		}
		
		if (alumno instanceof Object)
		{
			System.out.println("El alumno es instancia de la clase OBJECT");
		}
	}

}


