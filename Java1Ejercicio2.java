package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		int dia;
		System.out.println("Introduce un dia de la semana: ");
		dia = Integer.valueOf(scanner.next());
		scanner.close();
		if (dia==1) {
			System.out.println("A primera hora toca matematicas.");
		}else if (dia==2) {
			System.out.println("A primera hora toca Historia.");
		}else if (dia==3) {
			System.out.println("A primera hora toca Biologia.");
		}else if (dia==4) {
			System.out.println("A primera hora toca Fisica.");
		}else if (dia==5) {
			System.out.println("A primera hora toca Educacion Fisica.");
		}
	}

}
