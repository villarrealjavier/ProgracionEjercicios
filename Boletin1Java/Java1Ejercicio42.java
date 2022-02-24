package com.edu.Boletin1Java;


public class Java1Ejercicio42 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(obtenerTipoContrasena("Javi627!"));
		System.out.println(obtenerTipoContrasena("paco123"));
		System.out.println(obtenerTipoContrasena("currocurro"));

	}
	public static String obtenerTipoContrasena(String contrasena) {
		boolean numeros =false;
		boolean minus = false;
		boolean mayus = false;
		boolean signospunt=false;
		String signos = "-[]!¡¿?";
		String cadena="DEBIL";
	
		
		if (contrasena.length()>=8) {
			for (int i=0; i<contrasena.length(); i++) {
				if (Character.isUpperCase(contrasena.charAt(i))){
					mayus=true;
				}
				else if (Character.isLowerCase(contrasena.charAt(i))) {
					minus=true;
				}else if (Character.isDigit(contrasena.charAt(i))) {
					numeros=true;
				}else if (signos.indexOf(contrasena.charAt(i))!=-1){
					signospunt=true;
		}
			}
			if (mayus==true && minus==true && numeros==true && signospunt==true) {
				cadena="FUERTE";
			}
		
	
		
	}
		return cadena;
		
}}
