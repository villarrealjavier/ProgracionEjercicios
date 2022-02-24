package com.edu.Boletin1Java;

public class Java1Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Obtener_suma_100num_siguientes(1));
	}
	public static int Obtener_suma_100num_siguientes(int num) {
		int suma=num;
		int i=1;
		if (num>=0) {
		for (i=num+1; i<=num+100; i++) {
			suma+= i;
		}
	}else {
		suma=-1;
	}
		return suma;
	}
}

