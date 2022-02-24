package com.edu.Boletin1Java;

public class Java1Ejercicio6 {
	public static void main(String[] args) {
		System.out.println(ObtenerEstacion(3,22));
	}
	public static String ObtenerEstacion(int mes, int dia) {
		String cadena ="";
		if (dia<=31 && mes<=12) {
			if (mes>=6 && mes<=9) { //VERANO
				if (mes==6 && dia<21) {
					cadena = "Estamos en primavera, debes programar la temperatura a 20 grados.";
				}else if (mes==9 && dia>23) {
					cadena = "Estamos en otoño, debes programar la temperatura a 19 grados.";
				}
				else {
					cadena = "Estamos en Verano, debes programar la temperatura a 24 grados.";
				}
			
			}else if (mes>=9 && mes<=12){ //OTOÑO
				if (mes==9 && dia<=23) {
					cadena = "Estamos en Verano, debes programar la temperatura a 24 grados.";
				}else if (mes==12 && dia>=21) {
					cadena = "Estamos en Invierno, debes programar la temperatura a 19 grados";
				}else {
					cadena = "Estamos en otoño, debes programar la temperatura a 19 grados";
				}
			
			} else if (mes==12 || mes>=1 && mes<=3) { //INVIERNO
				if (mes==12 && dia<=21) {
					cadena = "Estamos en otoño, debes programar la temperatura a 19 grados";
				}else if (mes==3 && dia>=20) {
					cadena="Estamos en Primavera, debes programar la temperatura a 20 grados";
				}else {
					cadena = "Estamos en Invierno, debes programar la temperatura a 19 grados";
				}
			} else { //PRIMAVERA
				cadena="Estamos en Primavera, debes programar la temperatura a 20 grados";
			}
		
	} return cadena;
}}

