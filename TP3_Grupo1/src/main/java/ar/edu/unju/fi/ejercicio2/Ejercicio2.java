package ar.edu.unju.fi.ejercicio2;
import java.util.Iterator;
import java.util.Scanner;
 class Ejercicio2 {
	public static void main(String[]args) {
/*	
	Scanner sc = new Scanner(System.in);
	boolean band = true;
	int i ;
	int [] matriz = new int[11];
	while(band== true) {
	System.out.println("Ingrese un numero del 1 al 9");
	System.out.println("ingrese el 0 si desea terminar de ingresar");
	int num = sc.nextInt();
		if (num ==0) {
			System.out.println("Se ha finalizado el ingreso de valores ");
			band =false;
			}if(num>0 && num<=9){
				 for (i=0;i<11;i++) {
					 matriz[i]=i;
					 System.out.println(num+" X "+ matriz[i] + " = " + (num *matriz[i]) );
				}
				
			}else {
				System.out.println("ingreso un valor incorrecto ,por favor intentelo  nuevamente ");
			}
	
	}
	sc.close();
*/
		Scanner sc = new Scanner(System.in);
		boolean band = true;
		int i ;
		int [] matriz ={0,1,2,3,4,5,6,7,8,9,10};
		while(band== true) {
		System.out.println("Ingrese un numero del 1 al 9");
		System.out.println("ingrese el 0 si desea terminar de ingresar");
		int num = sc.nextInt();
			if (num ==0) {
				System.out.println("Se ha finalizado el ingreso de valores ");
				band =false;
				}if(num>0 && num<=9){
					 for (i=0;i<matriz.length;i++) {
						 
						 System.out.println(num+" X "+ matriz[i] + " = " + (num *matriz[i]) );
					}
					
				}else {
					System.out.println("ingreso un valor incorrecto ,por favor intentelo  nuevamente ");
				}
		
		}
}
}
