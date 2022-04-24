package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class principal2 {

	public static void main(String[] args) {
		int[] nente = new int[8];

		Scanner rellena = new Scanner(System.in);
		int partepar = 0;
		int parteimpar = 0;
		for (int i = 0; i < 8; i++) {
			System.out.println("Ingrese 8 numeros de tipo entero");
			nente[i] = rellena.nextInt();
			if (nente[i] % 2 == 0) {
				// vemos que se almacenan en el contador los numeros pares
				partepar = partepar + 1;
			} else {
				// vemos que se almacenan en el contador los numeros impares
				parteimpar = parteimpar + 1;
			}
		}
		// quiero guardar en cada arreglo nuevo los numeros pares e impares

		int par[] = new int[partepar];
		int impar[] = new int[parteimpar];

		partepar = 0;
		parteimpar = 0;
		for (int j = 0; j < 8; j++) {
			// ubicamos los numeros pares e impares
			if (nente[j] % 2 == 0) {
				par[partepar] = nente[j];
				partepar = partepar + 1;
			} else {
				impar[parteimpar] = nente[j];
				parteimpar = parteimpar + 1;
			}

		}
		// vemos la cantidad de ingreso de numeros pares
		System.out.println("Los numeros pares son:" + partepar);
		// se muestran los pares
		for (int j = 0; j < partepar; j++) {
			System.out.println(par[j]);
		}
		// vemos la cantidad de ingreso de numeros impares
		System.out.println("Los numeros impares son:" + parteimpar);
		for (int j = 0; j < parteimpar; j++) {
			System.out.println(impar[j]);
		}
		rellena.close();
	}

}
