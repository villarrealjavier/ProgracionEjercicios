package com.edu.Boletin1Java;

//import java.util.Scanner;

public class Java1Ejercicio3 {
	public static void main(String[] args) {
		
	
	
		/*3. Escribir un método que reciba un carácter y devuelva el tipo que es. Debe devolver una de
las se imprimir los siguientes mensajes según corresponda.
◦ Letra mayúscula
◦ Letra minúscula
◦ Dígito entre 0 y 9
◦ Signo de puntuación
◦ Espacio en blanco
◦ Paréntesis () o llaves*/
		//Scanner scanner = new Scanner(System.in);
		System.out.println(Obtenertipodecaracter('@'));
	}
		public static String Obtenertipodecaracter(char caracter) {
		
		String cadena="";
		String espacio=" ";
		String signos = "\'\\´\\`;,";
		String parentesis="{}[]";
		System.out.println("Introduce aqui el caracter: ");
		if (Character.isUpperCase(caracter)) {
			cadena = "El caracter es mayuscula";
		}else if (Character.isLowerCase(caracter)) {
			cadena = "El caracter es minuscula";
		}else if (Character.isDigit(caracter)) {
			cadena = "El caracter es un digito";
		}else if (signos.indexOf(caracter)!=-1) {
			cadena = "El caracter es un signo de puntuacion";
		}else if (espacio.indexOf(caracter)!=-1) {
			cadena = "El caracter es un espacio en blanco";
		}else if (parentesis.indexOf(caracter)!=-1) {
			cadena  = "El caracter es un parentesis o una llave";
		}else {
			cadena  = "Es otro caracter";
		}
		
		return cadena;

}

	}
