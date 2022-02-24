package com.edu.Boletin1Java;

public class Java1Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular las calificaciones de un alumno con un método que reciba la nota de la parte
práctica, la nota de los problemas y la parte teórica. La nota final se calcula según el
siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte
teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están, deberá devolver un
mensaje de error. Realiza el método que calcule la media de tres notas y te devuelva la nota
del boletín (insuficiente, suficiente, bien, notable o sobresaliente)*/
		System.out.println(Obtenercalificacion(0,0,0));
	}
	public static String Obtenercalificacion(double notateorica, double notaproblemas, double notapractica) {
	double notafinal=0;
	String cadena="";
	if (notateorica<=10 && notateorica>=0 && notapractica<=10 && notapractica>=0 && notaproblemas<=10 && notaproblemas>=0) {
		notateorica = (notateorica*40)/100;
		notapractica = (notapractica*10)/100;
		notaproblemas = (notaproblemas*50)/100;
		notafinal = notaproblemas+notapractica+notateorica;
		if (notafinal>=5 && notafinal<=6)
		{	cadena = "Tu nota es suficiente";
			
		}else if (notafinal>6 && notafinal<=7)
		{	cadena = "Tu nota es bien";
			
		}else if (notafinal>7 && notafinal<=8)
		{	cadena = "Tu nota es notable";
			
		}
		else if (notafinal>8 && notafinal<=10)
		{	cadena = "Tu nota es sobresaliente";
			
		}else if (notafinal<5){	
			cadena = "Tu nota es insuficiente";	
		}
	}else{
		cadena = "Introduce bien los numeros";
	}
	return cadena;
	}
	}

