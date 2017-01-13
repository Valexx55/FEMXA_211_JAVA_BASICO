package edu.femxa.val;

public class TiempoEnJava {
	
	
	public void pierdeTIempo () 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int j= -100000; j< 2000000; j++)
		{
			for (int i= -100000; i< 2000000; i++)
			{
			}
		}
	}
	public static void main(String[] args) {
		long tiempoInicial = System.currentTimeMillis();
		TiempoEnJava tiempo = new TiempoEnJava();
		tiempo.pierdeTIempo();
		long tiempoFinal = System.currentTimeMillis();
		
		double segundos = (tiempoFinal - tiempoInicial)/1000;
		
		System.out.println("Pierdetiempo tardó " + segundos + " segundos");
		
		
	}

}
