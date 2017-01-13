package edu.femxa.val;

public class LetraDni {

	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void main(String[] args) {
		int dni = 8274086;
		
		int resto = (dni%23);
		
		System.out.println(caracteresDNI.charAt(resto));
	}
	
	
}
