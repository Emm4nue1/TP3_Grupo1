/*Solicite al usuario que ingrese una cadena texto por consola, por ejemplo: hola mundo!
Guarde cada carácter de la cadena de texto (en sentido inverso, comenzando desde el último caracter) en un
arreglo de tipo char y muestre el contenido del arreglo por consola.*/

package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class punto5 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String txt = "", invertido = "";

		System.out.println("Ingrese una frase");
		txt = leer.nextLine();
		char letras[] = new char[txt.length()];

		System.out.println("\nLetras:\n");
		for (int i = txt.length() - 1; i >= 0; i--) {
			letras[i] = txt.charAt(i);
			System.out.println(letras[i]);
			invertido += txt.charAt(i);
		}

		System.out.println("\nTexto original: " + txt);
		System.out.println("Texto invertido: " + invertido);

		leer.close();
	}
}
