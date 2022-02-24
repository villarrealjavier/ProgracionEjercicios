package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		int contador=0;
		for (int i=0;i<15; i ++) {
			System.out.println("Introduce un numero: ");
			num = (Integer.valueOf(scanner.next()));
			contador = contador+num;
		}
		System.out.println(contador);
	}

}
