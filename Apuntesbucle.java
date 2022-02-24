package com.edu.Java1;

import java.util.Scanner;

public class Apuntesbucle {
	public static void main(String[] args) {
		/*for --> ( 1: declaracion y definicion de contador
		 			2: condicion
		 			3: actualizacion del contador
		 			
		 */
	/*for (int i =1; i <=10; i ++) {
		System.out.println(i*2);
}
	int j = 1;
	while (j <=10) {
		System.out.println(j*2);
		j++;
	}
	
	Scanner scanner = new Scanner(System.in);
	int numero = 0;
		while (numero>0 ) {
			System.out.println("Introduzca un numero");
			numero = Integer.valueOf(scanner.next());
			if (numero%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
		}
		
		
		int numero1 = 0;
		
		do {
			System.out.println("Introduzca un numero");
			numero1 = Integer.valueOf(scanner.next());
			if (numero1%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
		}while (numero1>0);
}*/
	boolean esPrimo = true;
	int numero =153;
	
	for (int i =2; i < numero && esPrimo ; i++) {
			if (numero% i==0) {
				esPrimo = false;
				
			}
	}
	if (esPrimo) {
		System.out.println("El numero " + numero + " es primo");
	}
		
}
}

