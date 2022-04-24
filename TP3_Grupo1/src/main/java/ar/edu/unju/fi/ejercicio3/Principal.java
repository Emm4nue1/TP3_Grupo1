package ar.edu.unju.fi.ejercicio3;

import java.util.ArrayList;

import java.util.Scanner;


public class Principal {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
	ArrayList<Alumno> alumnos = new ArrayList();
	
	String nombre = "";
	String apellido = "";
	int libretaU = 0;
	double[] notas	= new double[5]; ;	
	
	
		int option= 0;	
		boolean band = true;
		
		do {
			System.out.println("Elegir una opcion");
			if(band==true){
				System.out.println("1_Ingresar Alumno una vez(esta opcion es valida solo una vez)");
			}
				System.out.println("2–Mostrar atributos del Alumno\r\n"+"3_Fin del programa");
				option = sc.nextInt();
				
				if (option==1&& band==true) {
					
					band=false;
					System.out.println("Por favor ingrese un nombre ");
					nombre = sc.next();
					System.out.println("Por favor ingrese un apellido ");
					apellido = sc.next();
					System.out.println("Por favor ingrese  el numero de Libreta ");
					libretaU = sc.nextInt();

				        for (int j=0; j<notas.length; j++) 
				        	{
					        	System.out.println("Ingresar nota: "+ (j+1));
					        	notas[j]=sc.nextDouble();
					        	
				        	}
				       // sc.nextLine();//es para limpiar el bufer
					
				     Alumno a = new Alumno(nombre,apellido,libretaU,notas);
				     alumnos.add(a);
				}
				if (option ==2) {
					for (Alumno a:alumnos) {//para cada a representa un alumno en el arraylist alumnos
						System.out.println(" Nombre :"+a.getNombre()+" Apellido: "+a.getApellido()+" Numero de Libreta: "+a.getLibretaU()+" Promedio: "+a.calcularPromedio()+" Nota maxima :"+a.notasMax());
						
					}
					
				}else {
					System.out.println("Opcion Invalida");
				}
				if (option==3) {
					System.out.println("Fin del programa");
				}
				
			} while (option!=3);
								
					
	
				     sc.close();
					     
	}
	
}