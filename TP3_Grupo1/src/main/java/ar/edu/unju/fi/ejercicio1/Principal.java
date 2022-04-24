package ar.edu.unju.fi.ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner pedidod= new Scanner (System.in);
		int [] num1 = new int [5];
		int [] num2 = new int [5];
		int [] division = new int [5];
				
		
		for (int i =0;i<5;i++) 
		{
			do {
			System.out.println((i)+ " Ingrese 5 numeros enteros para el primer arreglo");
			System.out.println("Recuerde que si el valor es menor a cero, no se almacenará y deberá ingresar nuevamente");
				num1 [i] = pedidod.nextInt();
		
				} while (num1 [i] <= 0);
			}
		for (int j =0;j<4;j++) 
		{
			do {
			System.out.println((j+1)+ " Ingrese 5 numeros enteros para el segundo arreglo");
			System.out.println("Recuerde que si el valor es menor a cero, no se almacenará y deberá ingresar nuevamente");
			num2 [j] = pedidod.nextInt();
			} while (num2 [j] <= 0);
		}
		
		for (int k =0;k<4;k++) {
			division[k] = num1[k]/num2[k];
		
						
		}
		System.out.println("Resultado de la division:");
		for (int l =0;l<4;l++) {
			
			System.out.println(division[l]);
			
		}		
	


}
}


