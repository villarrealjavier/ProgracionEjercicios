package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(obtenerCadenacambiada("Cadena"));
		System.out.println(obtenerCadenacambiada("Cadenas"));
	}
	public static String obtenerCadenacambiada(String fraseacambiar) {
		Scanner sc = new Scanner(System.in);
		fraseacambiar=sc.nextLine();
		String frasecambiada="";
		for (int i=1; i<fraseacambiar.length(); i=i+2) {
			frasecambiada = frasecambiada 
							+ 	fraseacambiar.charAt(i)
							+ 	fraseacambiar.charAt(i-1);
			
		}
		if (fraseacambiar.length()%2!=0) {
			frasecambiada = frasecambiada
					+ fraseacambiar.charAt(fraseacambiar.length()-1);
		}
		
		
		
		return frasecambiada;
	}

}
