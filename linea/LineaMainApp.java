package profeb.clases.linea;

import java.util.Scanner;

public class LineaMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linea linea1 = new Linea();
		Scanner sc= Scanner(System.in);
		int op;
		int op2;
		System.out.println("Indica lo que desea hacer: ");
		System.out.println("1. Mover linea");
		System.out.println("2. Mostrar linea");
		System.out.println("3. Salir");
		op=Integer.valueOf(sc.nextLine());
		if(op==1) {
			
			System.out.println("A- Mover Arriba");
			System.out.println("B- Mover Abajo");
			System.out.println("I- Mover Izquierda");
			System.out.println("D- Mover Derecha");
			op2=Integer.valueOf(sc.nextLine());
			
		}
		
	}

}
