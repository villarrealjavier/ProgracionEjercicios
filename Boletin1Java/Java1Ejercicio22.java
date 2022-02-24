package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obtenercuadrado();
	}
	public static int Obtenercuadrado() {
		Scanner scanner = new Scanner(System.in);
		int cuadrado=1;
		int num1=0;
		for (int i=0;num1>=0;) {
			System.out.println("Introduce un numero: ");
			num1 = (Integer.valueOf(scanner.next()));
			cuadrado=num1*num1;
			System.out.println("El cuadrado del numero "+num1+" es "+cuadrado);
		}
		return cuadrado;
}
}