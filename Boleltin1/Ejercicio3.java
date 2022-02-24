package com.edu.Java1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int mes;
		int ano;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el año: ");
		ano = Integer.valueOf(scanner.next());
		
		System.out.println("Introduce el mes: ");
		mes = Integer.valueOf(scanner.next());
		
		while (ano>0) {
		if (ano%4==0 && ano%100!=0 || ano%400==0){
			switch(mes) {
			case 1:{
				System.out.println("Enero tiene 31");
				break;
			}
			case 2:{
				System.out.println("Febrero tiene 29");
				break;
			}
			case 3:{
				System.out.println("Marzo tiene 31");
				break;
			}
			case 4:{
				System.out.println("Abril tiene 30");
				break;
			}
			case 5:{
				System.out.println("Mayo tiene 31");
				break;
			}
			case 6:{
				System.out.println("Junio tiene 30");
				break;
			}
			case 7:{
				System.out.println("Julio tiene 31");
				break;
			}
			case 8:{
				System.out.println("Agosto tiene 31");
				break;
			}
			case 9:{
				System.out.println("Septiembre tiene 30");
				break;
			}
			case 10:{
				System.out.println("Octubre tiene 31");
				break;
			}
			case 11:{
				System.out.println("Noviembre tiene 30");
				break;
			}
			case 12:{
				System.out.println("Diciembre tiene 31");
				break;
			}
			default:
				System.out.println("Vuelve a introducir bien el mes");
				break;
			}
			}
			else {
			switch(mes) {
				case 1:{
					System.out.println("Enero tiene 31");
					break;
				}
				case 2:{
					System.out.println("Febrero tiene 28");
					break;
				}
				case 3:{
					System.out.println("Marzo tiene 31");
					break;
				}
				case 4:{
					System.out.println("Abril tiene 30");
					break;
				}
				case 5:{
					System.out.println("Mayo tiene 31");
					break;
				}
				case 6:{
					System.out.println("Junio tiene 30");
					break;
				}
				case 7:{
					System.out.println("Julio tiene 31");
					break;
				}
				case 8:{
					System.out.println("Agosto tiene 31");
					break;
				}
				case 9:{
					System.out.println("Septiembre tiene 30");
					break;
				}
				case 10:{
					System.out.println("Octubre tiene 31");
					break;
				}
				case 11:{
					System.out.println("Noviembre tiene 30");
					break;
				}
				case 12:{
					System.out.println("Diciembre tiene 31");
					break;
				}
				
				
		
			}
			
}
		System.out.println("-----------------------------------");
		System.out.println("Introduce el año: ");
		ano = Integer.valueOf(scanner.next());
		
		System.out.println("Introduce el mes: ");
		mes = Integer.valueOf(scanner.next());

}
}
}
	
