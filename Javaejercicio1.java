package com.edu.Boletin1Java;

import java.util.Scanner;

public class Javaejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		boolean resultado=false;
		System.out.println("Introduce el primer numero: ");
		num1 = Integer.valueOf(scanner.next());
		
		System.out.println("Introduce el segundo numero: ");
		num2 = Integer.valueOf(scanner.next());
		
		if (num1%num2==0) {
			resultado=true;	
			System.out.println(resultado);
		}else {
			resultado=false;
			System.out.println(resultado);
		}
		
	}

}
