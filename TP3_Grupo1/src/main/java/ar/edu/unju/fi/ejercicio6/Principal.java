package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglonro = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i <arreglonro.length;i++) {
			System.out.println("ingrese dato: ");
			arreglonro[i]=scan.nextInt();
		}
	/*	for (int i=0; i <arreglonro.length;i++) {
			System.out.println(arreglonro[i]);
		}*/
		for (int j=arreglonro.length-1;j>=0;j--) {
			System.out.println(arreglonro[j]);
		}
		System.out.println(arreglonro);
	}

}
