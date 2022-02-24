package com.edu.Java1;

import java.util.Scanner;

public class HolaMundoApp {

	public static void main(String[] args) {
		String name;
		int edad;
		String estacion;
		float peso;
		
		int dia;
		System.out.println("¿Cómo te llamas?");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		/*
		System.out.println("¿Qué dia de la semana es 1=Lunes, 2=Martes,..?");
		dia = Integer.valueOf(scanner.next());
		switch(dia) {
			case 1:{
				System.out.println("Lunes");
				break;
			}
			case 2:{
				System.out.println("Martes");
				break;
			}
			case 3:{
				System.out.println("Miercoles");
				break;
			}
			case 4:{
				System.out.println("Jueves");
				break;
			}
			case 5:{
				System.out.println("Viernes");
				break;
			}
			case 6:{
				System.out.println("Sabado");
				break;
			}
			case 7:{
				System.out.println("Domingo");
				break;
			}
			default:
				System.out.println("El dia introducido no es válido");
			}*/
			
		
		
		
		
		
		
		
		/*System.out.println("¿Qué dia de la semana es 1=Lunes, 2=Martes,..?");
		dia = Integer.valueOf(scanner.next());
		switch(dia) {
		case 1:{
			System.out.println("Lunes");
			
		}
		case 2:{
			System.out.println("Martes");
			
		}
		case 3:{
			System.out.println("Miercoles");
			
		}
		case 4:{
			System.out.println("Jueves");
			
		}
		case 5:{
			System.out.println("Viernes");
			
		}
		case 6:{
			System.out.println("Sabado");
			
		}
		case 7:{
			System.out.println("Domingo");
			
		}
		default:
			System.out.println("El dia introducido no es válido");
		
		}*/
		
		
		
		System.out.println("¿Cuál es tu edad 1?");
		edad = Integer.valueOf(scanner.next());
		
		if (edad>18) {
			System.out.println("Usted es mayor edad");
			
			
		}else {
			System.out.println("Usted es menor de edad");
		}
		
		
		
		
		
		
		
	
		System.out.println("¿Cuál es tu edad?");
		edad = Integer.valueOf(scanner.next());
		
		if (edad>65) {
			System.out.println("Usted es un anciano");
			
		}else if (edad<18) {
			System.out.println("Usted es niño");
		}else if (edad>18) {
			System.out.println("Usted es un adulto ");
		}else if (edad<0) {
			System.out.println("Introduce bien los numeros");
		}
			
		
		
		/*System.out.println("¿Summer or Winter?");
		estacion = scanner.next(); 	
		
		boolean abierto = true;
		if (abierto) {
			System.out.println("Puede pasar");
			
		} else {
			System.out.println("En otra ocasión");
			
		}*/
		
		/*System.out.println("¿Qué dia de la semana es 1=Lunes, 2=Martes,..?");
		dia = Integer.valueOf(scanner.next());
		if (dia==1) {
			System.out.println("Lunes");
		}
		else if (dia==2) {
			System.out.println("Martes");
		}
		else if (dia==3) {
			System.out.println("Miercoles");
		}
		else if (dia==4) {
			System.out.println("Jueves");
		}
		else if (dia==5) {
			System.out.println("Viernes");
		}
		else if (dia==6) {
			System.out.println("Sábado");
		}
		else if (dia==7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Introduce bien los numeros");
		}

			
	
		
		
		System.out.println("¿Cuanto pesas en kilogramos?");
		peso = Float.valueOf(scanner.next());*/
		
		
		
		
		
		
		
		
	
		/*
		long tipoLong = 1_000_000_000;
		char c = 'd';
		int numero = c;
		float VariableFloat = 0.9f;
		boolean variableBooleana = false;
		System.out.println(tipoLong);
		System.out.println(c);
		System.out.println(numero);
		System.out.println(VariableFloat);
		System.out.println(variableBooleana);
		System.out.println("Hello, "+name);
		System.out.println("Hello, I am "+edad);
		System.out.println("The best season is "+estacion);
		System.out.println("Usted pesa "+peso+" y es un fucking gordo");*/
		
	}

}
