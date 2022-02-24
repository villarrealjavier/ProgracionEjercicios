package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int num;
		int contador=0;
		for (int i=0;i<5; i ++) {
			System.out.println("Introduce un numero: ");
			num = (Integer.valueOf(scanner.next()));
			if (num%3==0) {
				System.out.println("El numero "+num+" es multiplo de 3.");
			}*/
		System.out.println(obtenermultiplos());
		}
		public static String obtenermultiplos() {
			Scanner scanner = new Scanner(System.in);
			String cadena="";
			int num;
			for (int i=0;i<5; i ++) {
				System.out.println("Introduce un numero: ");
				num = (Integer.valueOf(scanner.next()));
				if (num%3==0) {
					cadena+=num;
					cadena+= ",";
				}
			}return cadena;
			
			
			
			
		}
	
	}


