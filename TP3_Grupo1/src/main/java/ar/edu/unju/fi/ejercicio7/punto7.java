/*Declare un objeto de la clase ArrayList que solo permita almacenar elementos de tipo String. Solicite al
usuario que ingrese por consola de forma iterativa nombres de frutas, el ingreso de datos finaliza cuando el
usuario responde a la pregunta ¿Desea ingresar más datos? (S/N) con N.
Cada nombre ingresado es almacenado en el arrayList. Luego muestre por consola la lista de frutas que tienen
índice par.
Por último, solicite al usuario que ingrese un número entero positivo (validar que esté dentro del rango que
comprende a los índices del arrayList) y elimine el elemento que se encuentra en dicho índice. Muestre todo
el contenido del arrayList y la cantidad de elementos que contiene.*/

package ar.edu.unju.fi.ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class punto7 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		String fruta = "", rta = "";
		int num, N;
		boolean stop=true;

		do {
			System.out.println("Ingrese una fruta\n");
			fruta = leer.nextLine();
			System.out.println("¿Desea ingresar más datos? S/N\n");
			rta = leer.nextLine();
			frutas.add(fruta);
		} while (rta.equals("S") || rta.equals("s"));
		System.out.println("Frutas con indice par: ");
		for (int i = 0; i < frutas.size(); i += 2) {
			System.out.println("-" + frutas.get(i));
		}

		do {
			N = frutas.size();
			System.out.println("\nIngrese un numero mayor o igual a 0 y menor a " + (N - 1));
			num = leer.nextInt();
			if (num >= 0 && num <= (N - 1)) {
				frutas.remove(num);
				for (String x : frutas) {
					System.out.println(x);
				}
				System.out.println("Cantidad de frutas "+ frutas.size());
				stop=false;
			} else
				System.out.println("Ingrese un numero valido\n");
		} while (stop);
		leer.close();
	}

}
