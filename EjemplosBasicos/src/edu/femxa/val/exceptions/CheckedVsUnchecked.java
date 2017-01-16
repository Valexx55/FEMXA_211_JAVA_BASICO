package edu.femxa.val.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		String cadena = null;
		int  ae[] = null; //new int[4];
		
		try {
			FileReader fr = new FileReader("nombre");
			int longi = ae.length;
			ae[ae.length] = 3;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("EXCEPCI�N ARRAY");
			e.printStackTrace();
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("EXCEPCI�N NULL");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("EXCEPCI�N FILE_NOT");
			e.printStackTrace();
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println("EXCEPCI�N general");
			e.printStackTrace();
		}
		
		
		

	}

}
