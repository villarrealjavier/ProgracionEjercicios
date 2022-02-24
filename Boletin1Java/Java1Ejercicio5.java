package com.edu.Boletin1Java;

public class Java1Ejercicio5 {
	public static void main(String[] args) {
		System.out.println(Obtenerhoras(24));
	}
	public static String Obtenerhoras(int hora) {
		String cadena ="";
		if (hora>=0 && hora<=24) {
			if (hora>=6 && hora<=12) {
			cadena = "Buenos dias";
			} else if (hora>=13 && hora<=20) {
			cadena = "Buenas tardes";
			}else if (hora<6 || hora>20) {
			cadena = "Buenas noches";
		}
		}
		else{
			cadena = "Introduce una hora entre 0 y 24";
		}
		return cadena;
		

	}}
