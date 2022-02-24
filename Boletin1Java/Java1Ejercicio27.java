package com.edu.Boletin1Java;

import java.util.Scanner;

public class Java1Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int mayorSueldo=0;
		int menorSueldo=0;
		int resultado=0;
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un sueldo: ");
			int sueldo = (Integer.valueOf(scanner.nextInt()));
			
			resultado+=sueldo;
			
			if (sueldo>=1000) {
				mayorSueldo+=1;
			}
			else {
				menorSueldo+=1;
				
			}
			
		}
	System.out.println("La suma de los sueldos es: "+resultado);
	System.out.println(" Los sueldos mayores o iguales a 1000 son: "+mayorSueldo);
	System.out.println("Los sueldos menores a 1000 son: "+menorSueldo);
	}
	

}
