package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		String dia="";
		System.out.println("Introduce un día de la semana: ");
		dia = scanner.next();
		
		if (dia=="Lunes") {
			System.out.println("A primera hora toca matemáticas.");
		}else if (dia=="Martes") {
			System.out.println("A primera hora toca Historia.");
		}else if (dia=="Miercoles") {
			System.out.println("A primera hora toca Biología.");
		}else if (dia=="Jueves") {
			System.out.println("A primera hora toca Fisica.");
		}else if (dia=="Viernes") {
			System.out.println("A primera hora toca Educacion Fisica.");
		}
	}

	}

