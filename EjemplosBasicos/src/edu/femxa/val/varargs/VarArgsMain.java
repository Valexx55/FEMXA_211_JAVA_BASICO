package edu.femxa.val.varargs;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class VarArgsMain {
	
	
	private int regTelfs (String ... telefonos)
	{
		System.out.println("Contenido ");
		for (String cad : telefonos)
		{
			System.out.println(cad);
		}
		
		return telefonos.length;
	}
	
	public static void main(String[] args) {
		VarArgsMain va = new VarArgsMain();
		
		int n0 = va.regTelfs();
		System.out.println("N0 = "+  n0);
		
		int n1 = va.regTelfs("2");
		System.out.println("N1 = "+  n1);
		
		int n2 = va.regTelfs("2", "3");
		System.out.println("N2 = " + n2);
		
		int n3 = va.regTelfs("2", "3", "5");
		System.out.println("N3 = " + n3);
		
	}
}
