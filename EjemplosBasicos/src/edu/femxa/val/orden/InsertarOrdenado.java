package edu.femxa.val.orden;

public class InsertarOrdenado {
	
	
	public static int obtenerPos (int [] ae, int n)
	{
		int pos = 0;
		
		//TODO haced el cuerpo del método para obtener
		//el resultado esperado
		
		return pos;
	}
	
	public static void main(String[] args) {
		int ae[] = new int [5];
		
		ae[0] = 1;
		ae[1] = 2;
		ae[2] = 5;
		ae[3] = 6;
		ae[4] = 7;
		
		int n_usuario = 3;
		
		int pos = obtenerPos(ae, n_usuario);
		
		System.out.println("El numero " + n_usuario + " debe ir en " + pos);
		
	}

}
