package edu.femxa.val;



public class Ambito
{
	public static void nada () throws Exception
	{
		String palabra = null;
		try {
			palabra.charAt(1);
		}catch (Throwable e)
		{
			e.printStackTrace();
			
		}
	}
	
	public static void todo ()
	{
		System.out.println("Mambo Number " +5);
	}
	
	public static void main(String[] args) throws Exception {
		/*try
		{*/
			todo ();
			nada ();
			
		/*} catch (Throwable t)
		{
			System.out.println("OCURRi” un ERROR");
		}*/
		
	}
}